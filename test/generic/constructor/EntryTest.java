package generic.constructor;

import com.rodrigotroy.learning_java.generic.constructor.Entry;
import com.rodrigotroy.learning_java.generic.constructor.GenericEntry;
import com.rodrigotroy.learning_java.generic.constructor.Product;
import org.testng.annotations.Test;

import java.io.Serializable;

import static org.testng.Assert.assertNull;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_java_generics
 * User: rodrigotroy
 * Date: 2019-04-24
 * Time: 10:54
 */
public class EntryTest {
    @Test
    public void givenNonGenericConstructor_whenCreateNonGenericEntry_thenOK() {
        Entry entry = new Entry("sample",
                                1);

        assertEquals("sample",
                     entry.getData());
        assertEquals(1,
                     entry.getRank());
    }

    @Test
    public void givenGenericConstructor_whenCreateNonGenericEntry_thenOK() {
        Product product = new Product("milk",
                                      2.5);
        product.setSales(30);

        Entry entry = new Entry(product);

        assertEquals(product.toString(),
                     entry.getData());
        assertEquals(30,
                     entry.getRank());
    }

    @Test
    public void givenNonGenericConstructor_whenCreateGenericEntry_thenOK() {
        GenericEntry<String> entry = new GenericEntry<>(1);

        assertNull(entry.getData());
        assertEquals(1,
                     entry.getRank());
    }

    @Test
    public void givenGenericConstructor_whenCreateGenericEntry_thenOK() {
        GenericEntry<String> entry = new GenericEntry<>("sample",
                                                        1);

        assertEquals("sample",
                     entry.getData());
        assertEquals(1,
                     entry.getRank());
    }

    @Test
    public void givenGenericConstructorWithDifferentType_whenCreateGenericEntry_thenOK() {
        Product product = new Product("milk",
                                      2.5);
        product.setSales(30);

        GenericEntry<Serializable> entry = new GenericEntry<>(product);

        assertEquals(product,
                     entry.getData());
        assertEquals(30,
                     entry.getRank());
    }


}
