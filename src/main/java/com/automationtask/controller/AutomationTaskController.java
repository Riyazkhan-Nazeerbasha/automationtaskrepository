package com.automationtask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationTaskController {
	@GetMapping(value="/get")
	public String get() {
		return "Automation refers to the use of technology to perform tasks that would otherwise require human intervention. It involves the application of various control systems, such as computers, robots, and information technologies, to handle processes and machinery in different industries. The main goals of automation are to improve efficiency, accuracy, and consistency while reducing the need for manual labor.";
	}

}
