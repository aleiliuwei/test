package sample.web.thymeleaf3.service;

import java.util.*;

import sample.web.thymeleaf3.vo.User;

public interface IUserService {
	
	List<User> getAllList();
	Set<User> getAllSet();
	
	Map<String,User> getMap();
	
	User  getUser();

}
