package com.github.lmeadors;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Slf4j
@Component("correlationIdOff")
public class CorrelationIdOff {

	public void service() {
		log.info("in utility - clearing cid");
		MDC.remove("cid");
	}

}
