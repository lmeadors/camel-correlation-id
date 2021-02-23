package com.github.lmeadors;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Slf4j
@Component("correlationIdOn")
public class CorrelationIdOn {

	public void service(
		final Exchange exchange
	) {

		final String value = System.currentTimeMillis() + "";
		MDC.put("cid", value);
		exchange.setProperty("cid", value);
		log.info("in utility - cid set");

	}

}
