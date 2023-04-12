package com.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {
	
	@GetMapping("/bank/branches")
	public String bankBranches() {
		return "BankBranches";
	}

	@GetMapping("/bank/services")
	public String bankServices() {
		return "BankServices";
	}

}
