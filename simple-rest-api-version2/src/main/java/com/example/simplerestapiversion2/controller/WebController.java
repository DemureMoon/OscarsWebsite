package com.example.simplerestapiversion2.controller;

import com.example.simplerestapiversion2.models.SampleResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.Random;
//import com.example.simplerestapis.models.SampleResponse;

@RestController
public class WebController {

    //if no movie specified, picks a random one
    //Query search: http://localhost:8080/Oscars?movie/
    @RequestMapping("/Oscars")
    public SampleResponse Oscars(@RequestParam(value = "movie/", defaultValue = "empty query") String movie)
            throws IOException {
        SampleResponse response = new SampleResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        File JsonData = new File ("src/main/resources/datahubio_oscar_data_json.json");
        JsonNode root = objectMapper.readTree(JsonData);

        Random randGenerator = new Random();
        int rand = randGenerator.nextInt(11058);
        response.setId(rand);

        //this will output a message and then the 4 separate categories from the Json file
        response.setRandom("**Random movie!!**");
        response.setCategory(root.at("/" +rand+ "/category").asText());
        response.setEntity(root.at("/" +rand+ "/entity").asText());
        response.setWinner(root.at("/" +rand+ "/winner").asText());
        response.setYear(root.at("/" +rand+ "/year").asText());
        return response;

    }
}