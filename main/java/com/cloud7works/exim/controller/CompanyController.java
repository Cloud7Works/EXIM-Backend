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
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.cloud7works.exim.model.CompanyDto;
import com.cloud7works.exim.model.CompanyRequest;
import com.cloud7works.exim.model.UserDto;
import com.cloud7works.exim.model.UserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@EnableWebMvc
public class CompanyController {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CompanyController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
  

    @RequestMapping(path = "/companies", method = RequestMethod.POST)
    public ResponseEntity<CompanyDto> createPet(@RequestBody CompanyRequest newCompany) {
        
        if (newCompany.getCompanyName() == null || newCompany.getDunsNumber() == null) {
            return new ResponseEntity<CompanyDto>(HttpStatus.BAD_REQUEST);
        }

        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CompanyDto>(objectMapper.readValue("{\n  \"zipCode\" : \"20152\",\n  \"country\" : \"United States\",\n  \"companyId\" : 7,\n  \"city\" : \"Chantilly\",\n  \"companyName\" : \"Cloud7Works\",\n  \"addressLine1\" : \"123 Main Street\",\n  \"addressLine2\" : \"South Riding\",\n  \"state\" : \"VA\",\n  \"dunsNumber\" : \"5645646\",\n  \"naicsCode\" : \"54654\"\n}", CompanyDto.class), HttpStatus.CREATED);
            } catch (IOException e) {
             
                return new ResponseEntity<CompanyDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CompanyDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(path = "/companies/{companyId}", method = RequestMethod.GET)
    public ResponseEntity<CompanyDto> getCompany() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CompanyDto>(objectMapper.readValue("{\n  \"zipCode\" : \"20152\",\n  \"country\" : \"United States\",\n  \"companyId\" : 7,\n  \"city\" : \"Chantilly\",\n  \"companyName\" : \"Cloud7Works\",\n  \"addressLine1\" : \"123 Main Street\",\n  \"addressLine2\" : \"South Riding\",\n  \"state\" : \"VA\",\n  \"dunsNumber\" : \"5645646\",\n  \"naicsCode\" : \"54654\"\n}", CompanyDto.class), HttpStatus.OK);
            } catch (IOException e) {
             
                return new ResponseEntity<CompanyDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CompanyDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/companies/{companyId}/users", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    public ResponseEntity<UserDto> createCompanyUser(@PathVariable("companyId") Long companyId, @Valid @RequestBody UserRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserDto>(objectMapper.readValue("{\n  \"firstName\" : \"Ronald\",\n  \"lastName\" : \"J\",\n  \"companyId\" : 7,\n  \"phoneNumber\" : \"703-454-6543\",\n  \"title\" : \"Mr\",\n  \"userId\" : 1,\n  \"email\" : \"ronald@cloud7works.com\"\n}", UserDto.class), HttpStatus.CREATED);
            } catch (IOException e) {
               
                return new ResponseEntity<UserDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/companies/{companyId}/users/{userId}", produces = {
            "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<UserDto> getCompanyUser(@PathVariable("companyId") Long companyId, @PathVariable("userId") Long userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserDto>(objectMapper.readValue("{\n  \"firstName\" : \"Ronald\",\n  \"lastName\" : \"J\",\n  \"companyId\" : 7,\n  \"phoneNumber\" : \"703-454-6543\",\n  \"title\" : \"Mr\",\n  \"userId\" : 1,\n  \"email\" : \"ronald@cloud7works.com\"\n}", UserDto.class), HttpStatus.OK);    
            } catch (IOException e) {
                
                return new ResponseEntity<UserDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/companies/{companyId}", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.PATCH)
    public ResponseEntity<CompanyDto> updateCompany(@PathVariable("companyId") Long companyId,
            @Valid @RequestBody CompanyRequest body) {
                String accept = request.getHeader("Accept");
                if (accept != null && accept.contains("application/json")) {
                    try {
                        return new ResponseEntity<CompanyDto>(objectMapper.readValue("{\n  \"zipCode\" : \"20152\",\n  \"country\" : \"United States\",\n  \"companyId\" : 7,\n  \"city\" : \"Chantilly\",\n  \"companyName\" : \"Cloud7Works\",\n  \"addressLine1\" : \"123 Main Street\",\n  \"addressLine2\" : \"South Riding\",\n  \"state\" : \"VA\",\n  \"dunsNumber\" : \"5645646\",\n  \"naicsCode\" : \"54654\"\n}", CompanyDto.class), HttpStatus.OK);
                    } catch (IOException e) {
                       
                        return new ResponseEntity<CompanyDto>(HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                }
        
                return new ResponseEntity<CompanyDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/companies/{companyId}/users/{userId}", produces = { "application/json" }, consumes = {
            "application/json" }, method = RequestMethod.PATCH)
    public ResponseEntity<UserDto>  updateCompanyUser(@PathVariable("companyId") Long companyId, @PathVariable("userId") Long userId,
            @Valid @RequestBody UserRequest body) {
                String accept = request.getHeader("Accept");
                if (accept != null && accept.contains("application/json")) {
                    try {
                        return new ResponseEntity<UserDto>(objectMapper.readValue("{\n  \"firstName\" : \"Ronald\",\n  \"lastName\" : \"J\",\n  \"companyId\" : 7,\n  \"phoneNumber\" : \"703-454-6543\",\n  \"title\" : \"Mr\",\n  \"userId\" : 1,\n  \"email\" : \"ronald@cloud7works.com\"\n}", UserDto.class), HttpStatus.OK);    
                    } catch (IOException e) {
                       
                        return new ResponseEntity<UserDto>(HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                }
        
                return new ResponseEntity<UserDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
