package com.yash.user.service.controller;

import com.yash.user.service.model.User;
import com.yash.user.service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1=userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body (user1);
	}
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId){
		User user=userService.getUser (userId);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> userList= userService.getAllUser();
		return ResponseEntity.status(HttpStatus.OK).body(userList);
	}
	
	
}
