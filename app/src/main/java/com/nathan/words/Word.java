package com.nathan.words;

import java.util.Arrays;

public class Word {
    String word;
    String pronunciation;
    Definition[] definitions;

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", pronunciation'" + pronunciation + '\'' +
                ", definitions=" + Arrays.toString(definitions) +
                '}';
    }


}
