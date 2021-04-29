package com.example.simplerestapis.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.simplerestapis.models.SampleResponse;

//This clas may give errors depending on the IDE used but it runs perfectly fine
@RestController
public class WebController {

	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "MovieTitle") String movieTitle) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+ movieTitle);
		return response;

	}
}