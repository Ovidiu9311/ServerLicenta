package com.springapp.mvc.Service;

import com.springapp.mvc.Entity.Data;
import com.springapp.mvc.Entity.User;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by ovidiu on 3/24/2016.
 */
@Service
public class DataService {
    @PersistenceContext
    transient EntityManager entityManager;

    public List<Data> getData(){
        return entityManager.createQuery("select e from Data e", Data.class).getResultList();
    }
}
