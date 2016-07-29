package com.borisov.injection.bean.into.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by uladzislau on 7/28/16.
 */

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private Map<String, Document> map;

//    @Value("1")
    @Value("2")
    private String documentVersion;

    @PostConstruct
    @Override
    public void print() {
        Document document = map.get(documentVersion);
        if(document != null) {
            document.printDocument();
        }
    }
}
