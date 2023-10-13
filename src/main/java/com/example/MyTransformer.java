package com.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyTransformer implements Processor {
    public void process(Exchange exchange) throws Exception {
        String message = exchange.getIn().getBody(String.class);
        message = "Transformed by Spring: " + message;
        exchange.getIn().setBody(message);
    }
}
