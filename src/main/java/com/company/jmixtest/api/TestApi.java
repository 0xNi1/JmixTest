package com.company.jmixtest.api;

import com.company.jmixtest.entity.FuckTest;
import com.company.jmixtest.helper.EzEntity;
import com.company.jmixtest.service.TestOneService;
import io.jmix.core.DataManager;
import io.jmix.core.ValueLoadContext;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.metamodel.model.MetaClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestApi {

    @Autowired
    private TestOneService t;

    @Autowired
    private DataManager dataManager;

    @GetMapping("/")
    public void test() {
//        KeyValueEntity v=new KeyValueEntity()
        StringBuilder s = new StringBuilder();
        s.append("SELECT a.id FROM Test1 a");
        ValueLoadContext x =new ValueLoadContext();

//        EzEntity test = new EzEntity();
//        EzEntity test2 = new EzEntity();
//        List<EzEntity> test3 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            EzEntity tmp = new EzEntity();
//            tmp.addValue("Go" + i, i);
//            test3.add(tmp);
//        }
//        test2.setValue("test2", "gogo");
//        test.setValue("test3",test3);
//        test.setValue("test", test2);
//        test.setValue("goog", 1231);
//
//        System.out.println(test.toJsonString());
//        System.out.println(test.toJsonString());
//        System.out.println(n.toJsonString());
//        System.out.println(n.toJsonString());
//        t.testEntity();
    }

}
