package com.dev.HiddenBATH.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beauty")
public class BeautyController {

	@GetMapping({"","/"})
	public String beautyHome() {
		
		return "front/beauty/index";
	}
	
	@GetMapping("/about")
	public String beautyAbout() {
		
		return "front/beauty/about";
	}
	
	@GetMapping("/productList")
	public String beautyProductList() {
		
		return "front/beauty/productList";
	}
	
	@GetMapping("/productDetail")
	public String beautyProductDetail() {
		
		return "front/beauty/productDetail";
	}
}

