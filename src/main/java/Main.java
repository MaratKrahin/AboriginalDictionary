import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final List<String> aborDictionary = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Напишите слова для добавления или введите end для выхода");
            String text = sc.nextLine();
            if (text.equals("end")) {
                System.out.println("THE END");
                break;
            }

            Function<String, List<String>> readWords = s -> Arrays
                    .stream(s.trim().split(" "))
                    .distinct()
                    .collect(Collectors.toList());

            aborDictionary.addAll(readWords.apply(text));
            print(aborDictionary);

        }

    }

    private static void print(List<String> list) {
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    // Признаками функционального программирования являются:
    // - Присутствие Функционального интерфейса
    // - Использование Stream API

}