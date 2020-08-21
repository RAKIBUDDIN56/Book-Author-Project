package com.lms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lms.models.Book;
import com.lms.services.LmsService;

@Controller
public class MainController {
	
	@Autowired
	private LmsService lmsService;
	
	@GetMapping("/")
	public String init(HttpServletRequest req) {
		req.setAttribute("books",lmsService.findAllBooks());
		req.setAttribute("mode","BOOK_VIEW");
		return "index";
	}
	
	
	@GetMapping("/newBook")
	public String newBook(HttpServletRequest req ) {
	req.setAttribute("mode","BOOK_NEW");
	return "index";
		
		
	}
	
	
	

}
