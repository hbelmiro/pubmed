package com.thegreatapi;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

final class Parser {

    List<Article> parseFile(String file) {
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
