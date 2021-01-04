package com.cloud7works.exim.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.security.Principal;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.cloud7works.exim.model.CompanyDto;
import com.cloud7works.exim.model.CompanyRequest;
import com.cloud7works.exim.model.UserAccountDto;
import com.cloud7works.exim.model.UserAccountRequest;
import com.cloud7works.exim.model.UserDto;
import com.cloud7works.exim.model.UserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@EnableWebMvc
public class UsersController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
  
    @RequestMapping(value = "/users/{userId}/userAccount",
    produces = { "application/json" }, 
    consumes = { "application/json" }, 
    method = RequestMethod.POST)
    public ResponseEntity<UserAccountDto> createUserAccount(@PathVariable("userId") Long userId,
            @RequestBody UserAccountRequest body) {
       
            try {
                return new ResponseEntity<UserAccountDto>(objectMapper.readValue("{\n  \"userAccountId\" : 670,\n  \"userName\" : \"ronaldj\"\n}", UserAccountDto.class), HttpStatus.CREATED);
            } catch (IOException e) {
               
                return new ResponseEntity<UserAccountDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        

      
    }

}
