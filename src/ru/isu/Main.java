package ru.isu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
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
        for (String word :
                deque) {
            String element = deque.removeFirst();
            stringBuilder.insert(0, element);
            stringBuilder.insert(0, "/");
        }
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder.toString());
    }
}
