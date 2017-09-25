package com.example.security.model;

import org.apache.commons.lang.StringUtils;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Labotsky A.V. on 9/23/17.
 * E-Mail alieaksei.labotski@softclub.by
 * E-Mail lesharb@gmail.com
 * Skype lesharb
 * Project: cloud-netflix-template
 * ========================================
 * Когда я начинал это писать, только Бог и я понимали, что я делаю. Сейчас остался только Бог...
 */
@Entity
@Table(name = "USERS")
public class User {
	@Id
	private Integer id;
	private String username;
	private String password;
	private String passwordConfirm;
	private String email;
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "idUser"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private Set<Role> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + ", pass=" + password + ", passConfirm=" + passwordConfirm + ", email=" + email + ", role=" + StringUtils.join(roles, " ") + "]";
	}

}