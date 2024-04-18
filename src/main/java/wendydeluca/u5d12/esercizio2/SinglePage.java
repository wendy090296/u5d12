package wendydeluca.u5d12.esercizio2;

public class SinglePage implements Page{
    @Override
    public int getPagesNumber() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Single page of the book.");

    }
}
