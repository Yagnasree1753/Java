package LambdaFunctions;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Book {
    String title;
    List<String> authors;
    int pages;

    Book(String title, List<String> authors, int pages){
        this.title = title;
        this.authors = authors;
        this.pages = pages;
    }
    //Getters
    String getTitle(){
        return title;
    }
    List<String> getAuthors(){
        return authors;
    }
    int getPages(){
        return pages;
    }

}

public class BookFunctions{
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", Arrays.asList("John Doe", "jane Roe"), 200),
                new Book("Advanced Java", Arrays.asList("John Doe", "Richard Roe"), 300),
                new Book("Java Web", Arrays.asList("Jane Roe", "Michel Poe"), 150),
                new Book("Effective Java", Arrays.asList("Joshua Bloch", "John Doe"), 100)
        );
        List<String> authors = books.stream()
                .filter(book -> book.getPages() > 100)     //Filters books with more than 100 pages
                .map(Book::getTitle)                       //Map to Book titles
                .distinct()                                // Remove Duplicates
                .sorted()                                  //Sort alphabetically
                .peek(author -> System.out.println("Authors:" + author))//Peek to print each authors
                .limit(5)                          //Limit to 5 authors
                .skip(2)                                // Skip the first 2 authors
                .collect(Collectors.toList());             // Collect to a list
        System.out.println("Selected authors: " + authors);
    }

}

