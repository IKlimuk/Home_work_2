package com.ua.robotd.homework20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> dog = List.of("UK: dog", "JP: 犬", "FR: chien");
        List<String> cat = List.of("UK: cat", "JP: 猫", "FR: chat");
        List<String> parrot = List.of("UK: parrot", "JP: オウム", "FR: perroquet");
        List<String> elephant = List.of("UK: elephant", "JP: 象", "FR: éléphant");
        List<String> tiger = List.of("UK: tiger", "JP: 虎", "FR: tigre");
        List<String> monkey = List.of("UK: monkey", "JP: 猿", "FR: singe");
        List<String> crocodile = List.of("UK: crocodile", "JP: クロコダイル", "FR: crocodile");
        List<String> zebra = List.of("UK: zebra", "JP: シマウマ", "JP: zèbre");
        List<String> bear = List.of("UK: bear", "JP: クマ", "FR: ours");
        List<String> wolf = List.of("UK: wolf", "JP: 狼", "FR: loup");

        List[] wordsList = new List[]{dog, cat, parrot, elephant, tiger, monkey, crocodile, zebra, bear, wolf};

        Map<String, List<String>> dictionary1 = new HashMap<>();
        Map<String, List<String>> dictionary2 = new LinkedHashMap<>();
        Map<String, List<String>> dictionary3 = new TreeMap<>();

        String[] wordsUA = new String[]{"собака", "кіт", "папуга", "слон", "тигр", "мавпа",
                "крокодил", "зебра", "ведмідь", "вовк"};
        for (int i = 0; i < wordsUA.length; i++) {
            dictionary1.put(wordsUA[i], wordsList[i]);
            dictionary2.put(wordsUA[i], wordsList[i]);
            dictionary3.put(wordsUA[i], wordsList[i]);
        }
//        System.out.println(dictionary1);
//        System.out.println();
//        System.out.println(dictionary2);
//        System.out.println();
//        System.out.println(dictionary3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word from the list that you want to translate: ");
        for (String i : wordsUA) {
            System.out.print(i + ", ");
        }
        System.out.println();
        String enteredWord = scanner.nextLine();

        System.out.println("Word UA: " + enteredWord + " " + "translate: " + dictionary1.get(enteredWord));

    }
}
