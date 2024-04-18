package wendydeluca.u5d12.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Section implements Page{

    protected List<Page> pages = new ArrayList<>();

    @Override
    public int getPagesNumber() {
        return pages.stream().mapToInt(Page::getPagesNumber).sum();
    }

    @Override
    public void print() {
        System.out.println("Section");
        pages.forEach(Page::print);

    }

    public void addPage(Page firstPage){
        pages.add(firstPage);
    }
}
