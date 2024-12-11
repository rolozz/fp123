package org.kosareva.dao;

import org.kosareva.model.Example;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ExampleDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Example> getAllExamples() {
        return entityManager.createQuery("FROM Example ", Example.class).getResultList();
    }

}
