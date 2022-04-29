package com.thegreatapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Parser parser = new Parser();

        List<Article> articles1 = parser.parseFile("src/main/resources/1.csv");
        List<Article> articles2 = parser.parseFile("src/main/resources/2.csv");
        List<Article> articles3 = parser.parseFile("src/main/resources/3.csv");

        List<Article> allArticles = new ArrayList<>(articles1);
        allArticles.addAll(articles2);
        allArticles.addAll(articles3);

        Map<Article, Integer> map = new HashMap<>();

        allArticles.forEach(article -> {
            map.compute(article, (k, v) -> v == null ? 1 : v + 1);
        });

        map.entrySet().stream()
           .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
           .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

    }
}
