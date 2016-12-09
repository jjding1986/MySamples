package com.dingjinjin.demo.manager.impl;

import com.dingjinjin.demo.bean.Cat;
import com.dingjinjin.demo.manager.ICatManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CatManager implements ICatManager {

    @Override
    public Cat getCat() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans/bean.xml");
        return (Cat) ctx.getBean("Tom");
    }
}
