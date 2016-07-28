package spring.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.domain.User;

@RestController
public class SimpleRest {
	@RequestMapping(value="/user/{id}/{name}")
	public User getUserDetails(@PathVariable int id, @PathVariable String name){
		User user = new User(id,name);
		return user;
	}
}
