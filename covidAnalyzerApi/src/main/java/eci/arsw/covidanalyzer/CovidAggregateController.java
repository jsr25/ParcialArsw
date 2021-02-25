package eci.arsw.covidanalyzer;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidAggregateController {
    @Autowired
    @Qualifier("aggredate")
    ICovidAggregateService covidAggregateService;

    //Post
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.POST)
    public ResponseEntity<?> addTruePositiveResult(@RequestBody String json) {
        try{
        JSONObject jsonObject = new JSONObject(json);
        Result result =new Result(jsonObject);
        covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        System.out.println(jsonObject.get("id"));
        return new ResponseEntity<>(HttpStatus.CREATED.getReasonPhrase(), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.POST)
    public ResponseEntity addTrueNagativeResult(@RequestBody String json) {
        try{
            JSONObject jsonObject = new JSONObject(json);
            Result result =new Result(jsonObject);
            covidAggregateService.aggregateResult(result, ResultType.TRUE_NEGATIVE);
            System.out.println(jsonObject.get("id"));

            return new ResponseEntity<>(HttpStatus.CREATED.getReasonPhrase(), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.POST)
    public ResponseEntity addFalsePositiveResult(@RequestBody String json) {
        try{
            JSONObject jsonObject = new JSONObject(json);
            Result result =new Result(jsonObject);
            covidAggregateService.aggregateResult(result, ResultType.FALSE_POSITIVE);
            System.out.println(jsonObject.get("id"));

            return new ResponseEntity<>(HttpStatus.CREATED.getReasonPhrase(), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.POST)
    public ResponseEntity addFalseNegativeResult(@RequestBody String json) {
        try{
            JSONObject jsonObject = new JSONObject(json);
            Result result =new Result(jsonObject);
            covidAggregateService.aggregateResult(result, ResultType.FALSE_NEGATIVE);
            System.out.println(jsonObject.get("id"));

            return new ResponseEntity<>(HttpStatus.CREATED.getReasonPhrase(), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN);
        }
    }

    //GET

    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getTruePositiveResult() {
        covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getTrueNagativeResult() {
        covidAggregateService.getResult(ResultType.TRUE_NEGATIVE);
        return ResponseEntity.ok("Hello World");
    }
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getFalsePositiveResult() {

        covidAggregateService.getResult(ResultType.FALSE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getFalseNegativeResult() {

        covidAggregateService.getResult(ResultType.FALSE_NEGATIVE);
        return ResponseEntity.ok("Hello World");
    }




    @RequestMapping(value = "/covid/result/persona/{id}", method = RequestMethod.PUT)
    public ResponseEntity savePersonaWithMultipleTests() {
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return null;
    }
    
}