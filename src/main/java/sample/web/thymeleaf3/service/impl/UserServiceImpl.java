package sample.web.thymeleaf3.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import sample.web.thymeleaf3.service.IUserService;
import sample.web.thymeleaf3.vo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Override
	public List<User> getAllList() {
		List<User> list = new ArrayList<>();
		User u = new User();
		u.setId("zhangsan");
		u.setAge(25);
		u.setName("张三");
		list.add(u);
		u = new User();
		u.setId("lisi");
		u.setAge(27);
		u.setName("李四");
		list.add(u);
		return list;
	}
	
	@Override
	public Set<User> getAllSet() {
		Set<User> list = new HashSet<>();
		User u = new User();
		u.setId("zhangsan");
		u.setAge(25);
		u.setName("张三");
		list.add(u);
		u = new User();
		u.setId("lisi");
		u.setAge(27);
		u.setName("李四");
		list.add(u);
		return list;
	}

	@Override
	public Map<String,User> getMap() {
		Map<String,User> map = new HashMap<>();
		User u = new User();
		u.setId("zhangsan");
		u.setAge(25);
		u.setName("张三");
		map.put("user1", u);
		u = new User();
		u.setId("lisi");
		u.setAge(27);
		u.setName("李四");
		map.put("user2", u);
		return map;
	}

	@Override
	public User getUser() {
		User u = new User();
		u.setId("zhangsan");
		u.setAge(25);
		u.setName("张三");
		return u;
	}

}
