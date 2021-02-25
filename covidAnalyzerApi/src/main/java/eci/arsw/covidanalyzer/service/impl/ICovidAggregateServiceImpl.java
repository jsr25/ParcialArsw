package eci.arsw.covidanalyzer.service.impl;


import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
import eci.arsw.covidanalyzer.service.ICovidAggregateService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component()
@Qualifier("aggredate")
public class ICovidAggregateServiceImpl implements ICovidAggregateService {
    @Override
    public boolean aggregateResult(Result result, ResultType type) {
        return false;
    }

    @Override
    public boolean getResult(ResultType type) {
        return false;
    }

    @Override
    public void upsertPersonWithMultipleTests(UUID id, ResultType type) {

    }
}
