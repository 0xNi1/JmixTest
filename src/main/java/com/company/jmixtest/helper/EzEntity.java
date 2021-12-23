package com.company.jmixtest.helper;

import com.google.gson.Gson;
import io.jmix.core.entity.KeyValueEntity;

import java.util.*;

public class EzEntity extends KeyValueEntity {


    /**
     * properties回傳
     *
     * @return Map
     */
    public Map<String, Object> getProperties() {
        return super.properties;
    }

    /**
     * 得到map所有Key
     *
     * @return
     */
    public Set<String> getNames() {
        return super.properties.keySet();
    }

    /**
     * 新增Vaule
     *
     * @param name
     * @param v
     * @return
     */
    public EzEntity addValue(String name, Object v) {
        super.setValue(name, v);
        return this;
    }

    /**
     * Map轉Json
     *
     * @return
     */
    public String toJsonString() {
        Map<String, Object> tmp = ezToMap();
        return new Gson().toJson(tmp, LinkedHashMap.class);
    }

    /**
     * EzEntity轉Map
     *
     * @return
     */
    public Map<String, Object> ezToMap() {
        Map<String, Object> tmp = new HashMap<>(this.properties);
        for (String v : tmp.keySet()) {
            Object target = tmp.get(v);
            if (target instanceof EzEntity) {
                EzEntity tmp2 = (EzEntity) tmp.get(v);
                tmp.put(v, tmp2.ezToMap());
            } else if (target instanceof List) {
                List<Object> addList = new ArrayList<>();
                List<Object> tmpArray = (List<Object>) tmp.get(v);
                for (Object x : tmpArray) {
                    if (x instanceof EzEntity) {
                        EzEntity tmp3 = (EzEntity) x;
                        addList.add(tmp3.ezToMap());
                    }else{
                        addList.add(x);
                    }
                }
                tmp.put(v, addList);
            }
        }
        return tmp;
    }
}
