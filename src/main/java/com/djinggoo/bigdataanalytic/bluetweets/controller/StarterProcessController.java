package com.djinggoo.bigdataanalytic.bluetweets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.djinggoo.bigdataanalytic.bluetweets.service.TwitterService;

@RestController
@CrossOrigin(origins = {"*", "http://localhost:3005"})
public class StarterProcessController {
	
	@Autowired private TwitterService twitterService;
	
	@GetMapping(value = "/run")	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public String getTweet(){
		twitterService.runTwitterStream();
		return "pepare your self, the STREAM will be running :p :p !!!";
	}

	@GetMapping(value = "/callsp")	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public String callsp(){
		twitterService.removedata();
		return "store procedure has been running";
	}
	
}
