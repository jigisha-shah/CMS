package com.jigisha.cms.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jigisha.cms.model.Book;

@Controller
public class CMSController {
	@Value("#{countryOptions}")
	Map<String,String> countryOptions;
	
	@RequestMapping("/")
	public String showHome() {
		return "Home";
	}
	
	@RequestMapping("/addBook")
	public String addBook(Model m) {
		Book b = new Book();
		m.addAttribute("b", b);
		m.addAttribute("countryOptions",countryOptions);
		return "addBook";
	}
	
	@RequestMapping("/processBook")
	public String processBook(@Valid @ModelAttribute("b") Book b, BindingResult br) {
		
		if(br.hasErrors())
			return "addBook";
		else
			return "addBookConf";
	}
	
	
}
