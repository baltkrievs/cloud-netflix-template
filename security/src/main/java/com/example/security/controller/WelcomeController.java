package com.example.security.controller;

import com.example.security.dao.UserJpaRepository;
import com.example.security.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Labotsky A.V. on 9/23/17.
 * E-Mail alieaksei.labotski@softclub.by
 * E-Mail lesharb@gmail.com
 * Skype lesharb
 * Project: cloud-netflix-template
 * ========================================
 * Когда я начинал это писать, только Бог и я понимали, что я делаю. Сейчас остался только Бог...
 */
@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@Autowired
	private UserJpaRepository userJpaRepository;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(Model model) {
		List<User> users = userJpaRepository.findAll();

		users.forEach(user -> logger.info(user.toString()));
		System.out.println(users);

		model.addAttribute("user", users);
		return "welcome";
	}

}