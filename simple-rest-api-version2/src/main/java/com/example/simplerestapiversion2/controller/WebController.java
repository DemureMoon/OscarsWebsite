package com.example.simplerestapiversion2.controller;

import com.example.simplerestapiversion2.models.SampleResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
//import com.example.simplerestapis.models.SampleResponse;

@RestController
public class WebController {

    //only works if movie title is specified in this portion of code
    //Query search: http://localhost:8080/Oscars?movie/"movie name"
    @RequestMapping("/Oscars")
    public SampleResponse Oscars(@RequestParam(value = "movie/Bad Girl", defaultValue = "empty query") String movie)
            throws IOException {
        SampleResponse response = new SampleResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(new File("src/main/resources/datahubio_oscar_data_json.json"));

        //this is when outputs the response for category, movie title, oscar winning and year
        response.setCategory(root.at("/203/category").asText());
        response.setEntity(root.at("/203/entity").asText());
        response.setWinner(root.at("/203/winner").asText());
        response.setYear(root.at("/203/year").asText());
        return response;

    }
}