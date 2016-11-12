package sample.web.thymeleaf3.mvc;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sample.web.thymeleaf3.service.IUserService;
import sample.web.thymeleaf3.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/getAllList")
	public ModelAndView getAllList(){
		return new ModelAndView("users/list", "users", userService.getAllList()); 
	}
	
	@RequestMapping("/getAllSet")
	public ModelAndView getAllSet(){
		return new ModelAndView("users/set", "users", userService.getAllSet()); 
	}
	
	@RequestMapping("/getMap")
	public ModelAndView getMap(){
		return new ModelAndView("users/map", "usermap", userService.getMap()); 
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(){
		return new ModelAndView("users/user", "user", userService.getUser()); 
	}

}
