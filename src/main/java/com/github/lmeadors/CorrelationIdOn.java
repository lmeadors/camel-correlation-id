package com.github.lmeadors;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component("correlationIdOn")
public class CorrelationIdOn {

	public void service() {

		MDC.put("cid", System.currentTimeMillis() + "");
		log.info("in utility - cid set");

	}

}
