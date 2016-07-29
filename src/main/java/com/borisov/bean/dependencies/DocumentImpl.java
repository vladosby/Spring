package com.borisov.bean.dependencies;

import org.springframework.stereotype.Component;

/**
 * Created by uladzislau on 7/29/16.
 */

@Component
public class DocumentImpl implements Document {
    private String document;

    @Override
    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String getDocument() {
        return document;
    }
}
