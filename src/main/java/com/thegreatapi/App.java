package com.thegreatapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public final class App {

    private static final List<String> ESSENTIALS = List.of("human-microbiota-dysbiosis");

    public static void main(String[] args) throws IOException {


        var properties = new Properties();
        properties.load(App.class.getResourceAsStream("/query.properties"));

        var parser = new Parser(properties);

        Map<Article, List<String>> parseResult = parser.parse();

        System.out.println("Quantidade de artigos: " + parseResult.size() + System.lineSeparator());

        System.out.println("Artigos que se repetem: " + parseResult.entrySet().stream()
                                                                   .filter(entry -> entry.getValue().size() > 1)
                                                                   .count());

        System.out.println("Quantidade de artigos: " + parseResult.size() + System.lineSeparator());

        System.out.println("Quantidade de artigos com as queries essenciais e mais uma: "
                + getTotalThatHaveEssentials(parseResult) + System.lineSeparator());

        parseResult.entrySet().stream()
                   .filter(entry -> entry.getValue().size() > 1)
                   .filter(entry -> mustHave(ESSENTIALS, entry))
                   .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
                   .forEach(e -> System.out.println(e.getKey().getPmid() + " (" + e.getValue().size() + ") " + e.getValue()));

//        System.out.println(System.lineSeparator() + "Todos os artigos: " + System.lineSeparator());
//
//        parseResult.entrySet().stream()
//                   .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
//                   .forEach(e -> System.out.println(e.getKey().getPmid() + " (" + e.getValue().size() + ") " + e.getValue()));
    }

    private static boolean mustHave(List<String> essentialQueries, Map.Entry<Article, List<String>> entry) {
        return essentialQueries.stream().anyMatch(entry.getValue()::contains);
    }

    private static long getTotalThatHaveEssentials(Map<Article, List<String>> parseResult) {
        return parseResult.entrySet().stream()
                          .filter(entry -> entry.getValue().size() > 1)
                          .filter(entry -> mustHave(ESSENTIALS, entry))
                          .count();
    }
}
