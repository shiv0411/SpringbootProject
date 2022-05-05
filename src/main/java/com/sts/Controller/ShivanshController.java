package com.sts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.Service.ShivanshService;
import com.sts.Student.Shivansh;

@RestController
public class ShivanshController {
	
	   
	
	@Autowired
	private ShivanshService shivanshservice;
	
	@PostMapping("/shivansh")
	public Shivansh shivansh(@RequestBody ShivanshService request) {
		
	    Shivansh result =  shivanshservice.save(request.getShivansh());
	    
	    return result;
	}
	
	@GetMapping("/shivansh")
	public Float findAllshivansh(){
    return  shivanshservice.getPercent();
		
   
	 
	}

}
