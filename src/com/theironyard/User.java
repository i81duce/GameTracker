package com.theironyard;//Created by KevinBozic on 2/23/16.

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Game> games = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
