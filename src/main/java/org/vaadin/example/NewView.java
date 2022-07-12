package org.vaadin.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("test")
public class NewView extends Div {
    public NewView() {
        setText("Teste");
    }
}
