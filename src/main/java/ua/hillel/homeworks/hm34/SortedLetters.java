package ua.hillel.homeworks.hm34;

import java.util.stream.Collectors;

public class SortedLetters {
    public static void main(String[] args) {
        String eng = "ealgbkjdfvbjkhfdkbljvd";

        String sortedLetters = eng.chars().mapToObj(x -> (char) x).sorted().map(String::valueOf).collect(Collectors.joining());
        System.out.println(sortedLetters);
    }
}
