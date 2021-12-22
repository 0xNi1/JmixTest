package com.company.jmixtest.api;

import com.company.jmixtest.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {

    @Autowired
    private TestOneService t;
    @GetMapping("/")
    public void test(){
        t.testEntity();
    }

}
