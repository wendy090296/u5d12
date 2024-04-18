package wendydeluca.u5d12.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

import java.util.List;

public class Book implements Page {
    List<Page> pages =  new ArrayList<>();

    List<Author> authors = new ArrayList<>();
    private double price;

    @Override
    public int getPagesNumber() {
        return pages.stream().mapToInt(Page::getPagesNumber).sum();
    }

    @Override
    public void print() {
        System.out.println("Author");
        System.out.println("Book");
        authors.forEach(author-> System.out.println(author.getName()));
        pages.forEach(Page::print);

    }

    public void addAuthor(Author author){
        authors.add(author);

    }

    public void addPage(Page page){
        pages.add(page);

    }


}
