package com.thegreatapi;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

final class Parser {

    private final Properties properties;

    Parser(Properties properties) {
        this.properties = properties;
    }

    Map<Article, List<String>> parse() {
        Map<Article, List<String>> parseResult = new HashMap<>();

        properties.forEach((queryId, query) -> {
            List<Article> articles = parseFile("src/main/resources/" + queryId + ".csv");
            articles.forEach(article -> {
                parseResult.compute(article, (key, value) -> {
                    if (value == null) {
                        return List.of(query.toString());
                    } else {
                        List<String> newList = new ArrayList<>(value);
                        newList.add(query.toString());
                        return newList;
                    }
                });
            });
        });

        return parseResult;
    }

    private static List<Article> parseFile(String file) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(file));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return lines.stream()
                    .skip(1)
                    .map(Parser::parseLine)
                    .toList();
    }

    private static Article parseLine(String line) {
        return new Article(line.substring(1, line.indexOf('"', 1)));
    }
}
