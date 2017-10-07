package com.example.security.controller;

import com.example.security.model.User;
import com.example.security.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Labotsky A.V. on 10/7/17.
 * E-Mail alieaksei.labotski@softclub.by
 * E-Mail lesharb@gmail.com
 * Skype lesharb
 * Project: cloud-netflix-template
 * ========================================
 * Когда я начинал это писать, только Бог и я понимали, что я делаю. Сейчас остался только Бог...
 */
@RestController("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public List<User> users() {
		List<User> users = userRepository.findAll();
		users.forEach(user -> logger.info(user.toString()));
		return users;
	}
}
