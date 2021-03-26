
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<CountryLiteracy> countries;

        countries = readFromFile("literacy.csv");

        Collections.sort(countries, (country1, country2) -> country1.getLiteracyPercentage().compareTo(country2.getLiteracyPercentage()));
        countries.stream()
                .forEach(country -> System.out.println(country.toString()));
    }

    public static List<CountryLiteracy> readFromFile(String file) {
        List<CountryLiteracy> countries = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .map(parts -> new CountryLiteracy(parts[0], parts[1], parts[2].split(" ")[1].trim(), parts[3], Integer.valueOf(parts[4]), parts[5]))
                    .forEach(country -> countries.add(country));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return countries;
    }
}
