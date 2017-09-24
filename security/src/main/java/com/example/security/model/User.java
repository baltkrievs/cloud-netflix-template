package com.example.security.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String name;
	private String pass;
	private String email;
	// @OneToOne
	// @JoinTable(name = "user_role", joinColumns = {
	// @JoinColumn(name = "idUser", nullable = false, referencedColumnName = "id")
	// }, inverseJoinColumns = {
	// @JoinColumn(name = "idRole", nullable = false, referencedColumnName = "id")
	// })
	// private Role role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	// public Role getRole() {
	// return role;
	// }
	//
	// public void setRole(Role role) {
	// this.role = role;
	// }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + /*", role=" + role + */"]";
	}

}