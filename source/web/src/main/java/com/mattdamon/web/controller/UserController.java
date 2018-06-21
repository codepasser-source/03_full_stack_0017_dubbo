package com.mattdamon.web.controller;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mattdamon.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	@Getter
	@Setter
	private UserService userServiceImpl;

	@RequestMapping(value = "/view.action", method = RequestMethod.GET)
	public ModelAndView view() {
		System.out.println(userServiceImpl.getName());
		return new ModelAndView("/view/user/index.html");
	}

	@RequestMapping(value = "/search.do", method = RequestMethod.POST)
	@ResponseBody
	public String search() throws Exception {
		try {
			return "user search";
		} catch (Exception ex) {
			throw ex;
		}
	}

	@RequestMapping(value = "/get.do", method = RequestMethod.GET)
	@ResponseBody
	public String get() throws Exception {
		try {
			return "user get";
		} catch (Exception ex) {
			throw ex;
		}
	}

}
