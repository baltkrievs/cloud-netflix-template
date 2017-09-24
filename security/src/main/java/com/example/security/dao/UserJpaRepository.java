package com.example.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.model.User;

/**
 * Created by Labotsky A.V. on 9/23/17.
 * E-Mail alieaksei.labotski@softclub.by
 * E-Mail lesharb@gmail.com
 * Skype lesharb
 * Project: cloud-netflix-template
 * ========================================
 * Когда я начинал это писать, только Бог и я понимали, что я делаю. Сейчас остался только Бог...
 */
public interface UserJpaRepository extends JpaRepository<User, Integer> {
}
