import java.io.*;
import java.util.*;

public class Solution {
    static final String FILE_NAME = "quotes.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Quote");
            System.out.println("2. View All Quotes");
            System.out.println("3. Search Quote by Keyword");
            System.out.println("4. Sort Quotes Alphabetically");
            System.out.println("5. Quote of the Day");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addQuote(sc);
                    break;
                case 2:
                    viewQuotes();
                    break;
                case 3:
                    searchQuotes(sc);
                    break;
                case 4:
                    sortQuotes();
                    break;
                case 5:
                    quoteOfTheDay();
                    break;
                case 6:
                    return;
            }
        }
    }

    static void addQuote(Scanner sc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            System.out.print("Enter quote: ");
            String quote = sc.nextLine();
            fw.write(quote + "\n");
            System.out.println("Quote added successfully!");
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }

    static void viewQuotes() {
        System.out.println("---- All Quotes ----");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }

    static void searchQuotes(Scanner sc) {
        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("---- Search Results ----");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword)) {
                    System.out.println(line);
                    found = true;
                }
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
            return;
        }

        if (!found) {
            System.out.println("No results found.");
        }
    }

    static void sortQuotes() {
        List<String> quotes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                quotes.add(line);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
            return;
        }

        Collections.sort(quotes);

        System.out.println("---- Sorted Quotes ----");
        for (String q : quotes) {
            System.out.println(q);
        }

        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            for (String q : quotes) {
                fw.write(q + "\n");
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }

    static void quoteOfTheDay() {
        List<String> quotes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                quotes.add(line);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
            return;
        }

        if (quotes.isEmpty()) {
            System.out.println("No quotes available.");
            return;
        }

        Random r = new Random();
        System.out.println("---- Quote of the Day ----");
        System.out.println(quotes.get(r.nextInt(quotes.size())));
    }
}
