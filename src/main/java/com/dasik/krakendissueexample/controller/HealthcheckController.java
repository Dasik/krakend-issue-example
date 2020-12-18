package com.dasik.krakendissueexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@Slf4j
public class HealthcheckController {

	@GetMapping("healthcheck")
	@ResponseBody
	public Mono<String> privateResource() {
		return Mono.just("{\"status\": \"OK\"}")
				.log();
	}
}
