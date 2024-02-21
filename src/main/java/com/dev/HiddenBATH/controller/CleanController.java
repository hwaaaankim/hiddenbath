package com.dev.HiddenBATH.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clean")
public class CleanController {

	@GetMapping({"/", ""})
	public String cleanHome() {
		
		return "front/clean/index";
	}
}
