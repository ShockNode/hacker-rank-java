package com.shocknode.hackerrank.comparators;

import java.util.Comparator;
import java.util.stream.IntStream;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        return a.score == b.score ?
                a.name.compareTo(b.name):
                a.score > b.score ? -1:1;
    }
}
