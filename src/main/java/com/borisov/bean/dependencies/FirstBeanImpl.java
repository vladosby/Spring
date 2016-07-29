package com.borisov.bean.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * Created by uladzislau on 7/29/16.
 */

@Service
public class FirstBeanImpl implements FirstBean {
    @Autowired
    private Document document;

    @Override
    @Value("${shakespeareQuote}")
    public void create(String document) {
        this.document.setDocument(document);
    }
}
