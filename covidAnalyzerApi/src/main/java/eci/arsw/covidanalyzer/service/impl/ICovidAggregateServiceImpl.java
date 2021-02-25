package eci.arsw.covidanalyzer.service.impl;


import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.percistence.InMemory;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Component()
@Qualifier("aggredate")
public class ICovidAggregateServiceImpl implements ICovidAggregateService {
    private InMemory truePositive = new InMemory();
    private InMemory falsePositive = new InMemory();
    private InMemory trueNegative = new InMemory();
    private InMemory falseNegative = new InMemory();
    @Override
    public boolean aggregateResult(Result result, ResultType type) {
        boolean correct=false;
        if(type == ResultType.TRUE_POSITIVE){
            truePositive.add(result);
            correct=true;
        }
        else if(type == ResultType.TRUE_NEGATIVE){
            falsePositive.add(result);
            correct=true;
        }
        else if(type == ResultType.FALSE_POSITIVE){
            trueNegative.add(result);
            correct=true;
        }
        else {
            falseNegative.add(result);
            correct=true;
        }
        return correct;
    }

    @Override
    public boolean getResult(ResultType type) {
        boolean correct=false;
        if(type == ResultType.TRUE_POSITIVE){
            truePositive.getAll();
            correct=true;
        }
        else if(type == ResultType.TRUE_NEGATIVE){
            falsePositive.getAll();
            correct=true;
        }
        else if(type == ResultType.FALSE_POSITIVE){
            trueNegative.getAll();
            correct=true;
        }
        else {
            falseNegative.getAll();
            correct=true;
        }
        return correct;
    }

    @Override
    public void upsertPersonWithMultipleTests(UUID id, ResultType type) {

    }
}
