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
	
	@GetMapping("/about")
	public String cleanAbout() {
		
		return "front/clean/about";
	}
	
	@GetMapping("/productList")
	public String cleanProductList() {
		
		return "front/clean/productList";
	}
	
	@GetMapping("/productDetail")
	public String cleanProductDetail() {
		
		return "front/clean/productDetail";
	}
}
