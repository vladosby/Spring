package com.borisov.bean.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by uladzislau on 7/29/16.
 */

@Service
@DependsOn("firstBeanImpl")
public class DependentBeanImpl implements DependentBean {
    @Autowired
    private Document document;

    @PostConstruct
    @Override
    public void print() {
        System.out.println(document.getDocument());
    }
}
