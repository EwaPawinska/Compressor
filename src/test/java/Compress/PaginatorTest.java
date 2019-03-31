package Compress;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaginatorTest {

    //nie robimy setupu bo metoda ma konstruktor

    @Test
    public void paginate(){
        Paginator paginator = new Paginator(3);
        String given = "Ala ma kota";
        String [] expected = {"Ala", " ma", " ko", "ta"};
        assertArrayEquals(expected, paginator.paginate(given));
    }

    @Test
    public void paginate_short_text(){
        Paginator paginator = new Paginator(160);
        String given = "Ala ma kota";
        String [] expected = {"Ala ma kota"};
        assertArrayEquals(expected, paginator.paginate(given));
    }
}
