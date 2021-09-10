package com.digitalinnovationone.springwebmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.digitalinnovationone.springwebmvc.model.Jedi;
import com.digitalinnovationone.springwebmvc.repository.JediRepository;

@Controller
public class JediController {

	@Autowired
	private JediRepository repository;
	
	@GetMapping("/jedi")
	public ModelAndView jedi() {

		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");

		modelAndView.addObject("allJedi", repository.getAllJedi());

		return modelAndView;

	}

	@GetMapping("new-jedi")
	public ModelAndView newJedi() {
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new-jedi");

		modelAndView.addObject("jedi", new Jedi());
		return modelAndView;
	}

}
