package com.nathan.words;

public class Definition {
    String definition;
    String image_url;
    String example;
    String type;

    @Override
    public String toString() {
        return "Definition{" +
                "definition='" + definition + '\'' +
                ", image_url'" + image_url + '\'' +
                ", example='" + example + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
