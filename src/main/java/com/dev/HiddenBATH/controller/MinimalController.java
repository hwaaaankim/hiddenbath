package com.dev.HiddenBATH.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/minimal")
@Controller
public class MinimalController {

	@GetMapping({"","/"})
	public String minimalHome() {
		
		return "front/minimal/index";
	}
}
