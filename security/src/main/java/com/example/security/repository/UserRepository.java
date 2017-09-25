package com.example.security.repository;

import com.example.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Labotsky A.V. on 9/23/17.
 * E-Mail alieaksei.labotski@softclub.by
 * E-Mail lesharb@gmail.com
 * Skype lesharb
 * Project: cloud-netflix-template
 * ========================================
 * Когда я начинал это писать, только Бог и я понимали, что я делаю. Сейчас остался только Бог...
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}  