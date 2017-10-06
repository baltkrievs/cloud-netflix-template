package com.example.security.controller;

import java.security.Principal;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class AppController {
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	// @Autowired
	// private UserRepository userRepository;

	// @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	// public List<User> users() {
	// List<User> users = userRepository.findAll();
	// users.forEach(user -> logger.info(user.toString()));
	// return users;
	// }

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Info readFoo(@PathVariable Integer id, Principal principal) {
		Info info = new Info();
		info.setId(id);
		info.setResource(UUID.randomUUID());
		info.setUser(principal.getName());
		return info;
	}

	class Info {
		private Integer id;
		private UUID resource;
		private String user;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public UUID getResource() {
			return resource;
		}

		public void setResource(UUID resource) {
			this.resource = resource;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}
	}
}
