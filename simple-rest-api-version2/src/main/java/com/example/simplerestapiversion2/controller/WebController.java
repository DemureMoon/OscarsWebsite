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

@RestController
public class WebController {

    //Query search: http://localhost:8080/Oscars?search= "movie title, year, etc"
    @RequestMapping("/Oscars")
    public SampleResponse Oscars(@RequestParam(value = "search", defaultValue = "empty query") String search)
            throws IOException {
        SampleResponse response = new SampleResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        File JsonData = new File ("src/main/resources/datahubio_oscar_data_json.json");
        JsonNode root = objectMapper.readTree(JsonData);

        //search by entity, year, category and winner
        for ( int i = 0; i < 11058; i++) {
            //title search
            if (search.equals(root.at("/" +i+ "/entity").asText())) {
                response.setId(i);
                response.setCategory(root.at("/" +i+ "/category").asText());
                response.setEntity(root.at("/" +i+ "/entity").asText());
                response.setWinner(root.at("/" +i+ "/winner").asText());
                response.setYear(root.at("/" +i+ "/year").asText());
                return response;
            }
            //year search
            else if (search.equals(root.at("/" +i+ "/year").asText())) {
                response.setId(i);
                response.setCategory(root.at("/" +i+ "/category").asText());
                response.setEntity(root.at("/" +i+ "/entity").asText());
                response.setWinner(root.at("/" +i+ "/winner").asText());
                response.setYear(root.at("/" +i+ "/year").asText());
                return response;
            }
            //winner: true or false search
            else if (search.equals(root.at("/" +i+ "/winner").asText())) {
                response.setId(i);
                response.setCategory(root.at("/" +i+ "/category").asText());
                response.setEntity(root.at("/" +i+ "/entity").asText());
                response.setWinner(root.at("/" +i+ "/winner").asText());
                response.setYear(root.at("/" +i+ "/year").asText());
                return response;
            }
            //category search
            else if (search.equals(root.at("/" +i+ "/category").asText())) {
                response.setId(i);
                response.setCategory(root.at("/" +i+ "/category").asText());
                response.setEntity(root.at("/" +i+ "/entity").asText());
                response.setWinner(root.at("/" +i+ "/winner").asText());
                response.setYear(root.at("/" +i+ "/year").asText());
                return response;
            }
            //if nothing searched, return random movie
            else {
                Random randGenerator = new Random();
                int rand = randGenerator.nextInt(11058);
                response.setId(rand);
                response.setCategory(root.at("/" +rand+ "/category").asText());
                response.setEntity(root.at("/" +rand+ "/entity").asText());
                response.setWinner(root.at("/" +rand+ "/winner").asText());
                response.setYear(root.at("/" +rand+ "/year").asText());
            }
        }
        return response;
    }//end Oscars method
}//end WebController class