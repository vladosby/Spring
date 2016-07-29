package com.borisov.colors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created by uladzislau on 7/27/16.
 */

@Component
public class ColoredFrame extends JFrame {
    @Autowired
//    @Qualifier("colorFactory")
    private Color color;


    @PostConstruct
    public void init() {
        setSize(400, 400);
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
