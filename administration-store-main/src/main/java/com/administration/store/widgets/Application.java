package com.administration.store.widgets;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * Created by skylar on 10.02.16.
 */
@SpringUI
public class Application extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello! I'm root UI!"));
    }
}
