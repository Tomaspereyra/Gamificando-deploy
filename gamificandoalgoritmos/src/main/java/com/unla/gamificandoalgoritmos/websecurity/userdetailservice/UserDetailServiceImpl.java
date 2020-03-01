package com.unla.gamificandoalgoritmos.websecurity.userdetailservice;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.unla.gamificandoalgoritmos.repository.IUserRepository;
import com.unla.gamificandoalgoritmos.websecurity.Usuario;

@Service("UserDetailsServiceImpl")
public class UserDetailServiceImpl implements UserDetailsService {
	@Autowired
	private IUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
			Usuario usuario = userRepository.findByEmail(email);
			if(usuario !=null) {
				return new User(usuario.getEmail(),usuario.getPassword(),Collections.emptyList());
			}else {
				throw new UsernameNotFoundException("Unknow user:"+email);
			}
		
		
	}

}

