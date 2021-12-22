package com.company.jmixtest.respository;

import com.company.jmixtest.entity.TestOne;
import io.jmix.core.repository.JmixDataRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface TestOneRep extends JmixDataRepository<TestOne,Integer> {

        List<TestOne> findByName(String name);
}
