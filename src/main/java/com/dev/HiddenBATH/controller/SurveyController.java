package com.dev.HiddenBATH.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@GetMapping({"", "/"})
	public String surveyHome() {
		
		return "front/survey/index";
	}
}
