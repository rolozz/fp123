package org.kosareva.services;

import org.kosareva.dao.ExampleDao;
import org.kosareva.model.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExampleService {

    private final ExampleDao exampleDao;

    public ExampleService(ExampleDao exampleDao) {
        this.exampleDao = exampleDao;
    }

    @Transactional(readOnly = true)
    public List<Example> getAll(){
        return exampleDao.getAllExamples();
    }
}
