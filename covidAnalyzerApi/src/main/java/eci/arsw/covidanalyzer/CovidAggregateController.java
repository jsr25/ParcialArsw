package eci.arsw.covidanalyzer;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity addTruePositiveResult(JSONObject json) {
        Result result =new Result(json);
        covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        return null;
    }

//    @RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.POST)
//    public ResponseEntity addTrueNagativeResult(Result result) {
//        covidAggregateService.aggregateResult(result, ResultType.TRUE_NEGATIVE);
//        return null;
//    }
//
//    @RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.POST)
//    public ResponseEntity addFalsePositiveResult(Result result) {
//        covidAggregateService.aggregateResult(result, ResultType.FALSE_POSITIVE);
//        return null;
//    }
//
//    @RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.POST)
//    public ResponseEntity addFalseNegativeResult(Result result) {
//        covidAggregateService.aggregateResult(result, ResultType.FALSE_NEGATIVE);
//        return null;
//    }

    //GET

    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getTruePositiveResult() {
        covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }
//    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
//    public ResponseEntity getTrueNagativeResult() {
//        covidAggregateService.getResult(ResultType.TRUE_NEGATIVE);
//        return ResponseEntity.ok("Hello World");
//    }
//    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
//    public ResponseEntity getFalsePositiveResult() {
//
//        covidAggregateService.getResult(ResultType.FALSE_POSITIVE);
//        return ResponseEntity.ok("Hello World");
//    }
//    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
//    public ResponseEntity getFalseNegativeResult() {
//
//        covidAggregateService.getResult(ResultType.FALSE_NEGATIVE);
//        return ResponseEntity.ok("Hello World");
//    }




    @RequestMapping(value = "/covid/result/persona/{id}", method = RequestMethod.PUT)
    public ResponseEntity savePersonaWithMultipleTests() {
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return null;
    }
    
}