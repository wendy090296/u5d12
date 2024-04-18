package wendydeluca.u5d12.esercizio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("***************** COMPOSITE **********************");
        System.out.println();
        Author author1 = new Author("Gianluca Gotto");
        Author author2 = new Author("Tiziano Terzani");

        Page page1 = new SinglePage();
        Page page2 = new SinglePage();
        Page page3 = new SinglePage();
        Page page4 = new SinglePage();

        Section section1 = new Section();
        Section section2 = new Section();
        section1.addPage(page1);
        section1.addPage(page2);
        section2.addPage(page1);
        section2.addPage(page2);
        section2.addPage(page3);
        section2.addPage(page4);

        Book book= new Book();
        book.addAuthor(author1);
        book.addAuthor(author2);
        book.addPage(page1);
        book.addPage(page2);
        book.addPage(page3);
        book.addPage(page4);
        book.addPage(section1);
        book.addPage(section2);

        book.print();
        System.out.println("The number of pages of the book is: " + book.getPagesNumber());
        System.out.println();

    }


}
