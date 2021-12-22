package com.company.jmixtest.service;

import com.company.jmixtest.entity.TestOne;
import com.company.jmixtest.respository.TestOneRep;
import io.jmix.core.DataManager;
import io.jmix.core.ValueLoadContext;
import io.jmix.core.entity.KeyValueEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestOneService {

    @Autowired
    private TestOneRep testOneRepository;

    private DataManager dataManager;

    public void testEntity(){

        List<TestOne> t = testOneRepository.findByName("fuck");
//        ValueLoadContext t =new ValueLoadContext();
//        t.setStoreName("test1");
//        t.setQueryString("SELECT a FROM TestOne a");
//        List<KeyValueEntity> d = dataManager.loadValues(t);
        System.out.println(t);
    }
}
