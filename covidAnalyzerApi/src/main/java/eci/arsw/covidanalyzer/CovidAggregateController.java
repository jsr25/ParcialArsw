package eci.arsw.covidanalyzer;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidAggregateController {
    //ICovidAggregateService covidAggregateService;

    //Post
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.POST)
    public ResponseEntity addTruePositiveResult(Result result) {
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        return null;
    }

    @RequestMapping(value = "/covid/result/true-negative", method = RequestMethod.POST)
    public ResponseEntity addTrueNagativeResult(Result result) {
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        return null;
    }

    @RequestMapping(value = "/covid/result/false-positive", method = RequestMethod.POST)
    public ResponseEntity addFalsePositiveResult(Result result) {
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        return null;
    }

    @RequestMapping(value = "/covid/result/false-negative", method = RequestMethod.POST)
    public ResponseEntity addFalseNegativeResult(Result result) {
        //covidAggregateService.aggregateResult(result, ResultType.TRUE_POSITIVE);
        return null;
    }

    //GET

    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getTruePositiveResult() {
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getTrueNagativeResult() {
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getFalsePositiveResult() {
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }
    @RequestMapping(value = "/covid/result/true-positive", method = RequestMethod.GET)
    public ResponseEntity getFalseNegativeResult() {
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return ResponseEntity.ok("Hello World");
    }


    //TODO: Implemente el método.

    @RequestMapping(value = "/covid/result/persona/{id}", method = RequestMethod.PUT)
    public ResponseEntity savePersonaWithMultipleTests() {
        //TODO
        //covidAggregateService.getResult(ResultType.TRUE_POSITIVE);
        return null;
    }
    
}