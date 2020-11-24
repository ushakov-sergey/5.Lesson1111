package ru.isu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("/");
        Deque<String> deque = new ArrayDeque<>();
        for (String word :
                split) {
            if (word.equals("..")) {
                if (!deque.isEmpty()) deque.removeFirst();
                else deque.addFirst(word);
            } else if (!word.equals(".")){
                deque.addFirst(word);
            }
        }
        StringJoiner joiner = new StringJoiner("/");
        while (!deque.isEmpty()) {
            joiner.add(deque.removeLast());
        }

        System.out.println(joiner.toString());
    }
}
