package generic.constructor;

import com.rodrigotroy.learning_java.generic.constructor.MapEntry;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * $ Project: learning_java_generics
 * User: rodrigotroy
 * Date: 2019-04-24
 * Time: 11:05
 */
public class MapEntryTest {
    @Test
    public void givenGenericConstructor_whenCreateGenericEntryWithTwoTypes_thenOK() {
        MapEntry<String, Integer> entry = new MapEntry<>("sample",
                                                         1);

        assertEquals("sample",
                     entry.getKey());
        assertEquals(1,
                     entry.getValue().intValue());
    }
}
