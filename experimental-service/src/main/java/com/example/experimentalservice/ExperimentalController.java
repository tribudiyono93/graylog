package com.example.experimentalservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experimental")
public class ExperimentalController {
	
	private static final Logger logger = LoggerFactory.getLogger(ExperimentalController.class);
	
	@GetMapping("/log")
	public ResponseEntity<?> sendLog() {
		logger.info("Trying send log");
		try {
			if (true) throw new Exception("Tray log exception");
		} catch (Exception e) {
			logger.error("Exception", e);
		}
		
		return ResponseEntity.ok("Hello");
	}
}
