package com.yash.user.service.service;

import com.yash.user.service.model.User;
import com.yash.user.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.image.RasterFormatException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	public User saveUser(User user) {
		return userRepository.save (user);
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public User getUser(Long userId){
    return userRepository.findById(userId).orElseThrow(() -> new RasterFormatException(" User with given Id is not found on the server :: "+userId));
	}
}
