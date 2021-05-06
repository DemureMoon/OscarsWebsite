package com.example.simplerestapiversion2.models;

public class SampleResponse {
    private String random;
    private String category;
    private String entity;
    private String winner;
    private String year;
    private long id;

    //random movie pick
    public String getRandom() {
        return random;
    }
    public void setRandom(String random) {
        this.random = random;
    }

    //id
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    //category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    //entity(movie name)
    public String getEntity() {
        return entity;
    }
    public void setEntity(String entity) {
        this.entity = entity;
    }

    //Oscars winner
    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }

    //movie year
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }




}