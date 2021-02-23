package com.github.lmeadors;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.ExchangeProperty;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component("helloBean")
public class HelloBean {

    public String hello(
        @ExchangeProperty("cid") final String cid
    ) {

        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return String.format(
            "Hello World at %s (%s)",
            sdf.format(new Date()),
            cid
        );
    }

}
