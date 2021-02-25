package eci.arsw.covidanalyzer.thread;

import eci.arsw.covidanalyzer.Result;
import eci.arsw.covidanalyzer.ResultAnalyzer;
import eci.arsw.covidanalyzer.TestReader;

import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LectorThread extends Thread{
    private List<File> files;
    private int rangei;
    private int rangefinal;
    private TestReader testReader;
    private ResultAnalyzer resultAnalyzer;
    private AtomicInteger amountOfFilesProcessed;


    public LectorThread(String name, List<File> files, int rangei, int rangefinal){
        super(name);
        this.files=files;
        this.rangei=rangei;
        this.rangefinal=rangefinal;
        resultAnalyzer = new ResultAnalyzer();
        testReader = new TestReader();
        amountOfFilesProcessed = new AtomicInteger();
    }

    public void run(){
        amountOfFilesProcessed.set(0);
        for (int i = rangei; i<rangefinal;i++) {
            List<Result> results = testReader.readResultsFromFile(files.get(i));
            for (Result result : results) {
                resultAnalyzer.addResult(result);
            }
            amountOfFilesProcessed.incrementAndGet();
        }
    }
}
