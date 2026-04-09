import org.ies.tierno.library.exceptions.BookNotFoundException;
import org.ies.tierno.library.exceptions.CustomerNotFoundException;
import org.ies.tierno.library.model.Library;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {


    @Test
    public void testTrue() throws Exception {
        Library library = new Library();
        boolean resultado = library.existsBookLend(322443, "52165517P");
        assertTrue(resultado);
    }

    @Test
    public void testFalse() throws Exception {
        Library library = new Library();
        boolean resultado = library.existsBookLend(1L, "5352627P");
        assertFalse(resultado);
    }

    @Test
    public void testBookNotFound() {
        Library library = new Library();

        assertThrows(BookNotFoundException.class, () -> library.findBook(432627));
    }


    @Test
    public void testCustomerNotFound() {
        Library library = new Library();
        assertThrows(CustomerNotFoundException.class, () -> library.findCustomer("52178728P"));

    }




}



