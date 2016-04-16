package com.springapp.mvc.Service;

import com.springapp.mvc.Entity.User;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

/**
 * Created by ovidiu on 3/11/2016.
 */
@Service
public class UserService {
    @PersistenceContext
    transient EntityManager entityManager;

    public List<User> getUser(){
        return entityManager.createQuery("select e from User e", User.class).getResultList();
    }
    public Boolean userExist(String userName,String password){
        Boolean exista = false;
        Long i = (Long) entityManager.createQuery("select count(u) from User u where u.userName=:userName and u.password=:password").setParameter("userName",userName).setParameter("password",password).getSingleResult();
        if(i.intValue() == 1){
            exista = true;
        }
        return exista;
    }

}
