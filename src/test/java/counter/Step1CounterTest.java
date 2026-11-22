package counter;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Step 1: Counter Interface Contract Tests")
public class Step1CounterTest {


    @Test
    @DisplayName("Counter is declared as an interface")
    void testCounterIsInterface() {
        assertTrue(Counter.class.isInterface(),
                "Counter must be declared as an 'interface', not a class (e.g. 'public interface Counter { ... }')");
    }


    @Test
    @DisplayName("Counter declares countWords(String) returning int")
    void testCountWordsDeclaration() {
        try {
            Method method = Counter.class.getMethod("countWords", String.class);
            assertEquals(int.class, method.getReturnType(),
                    "countWords(String) must return an int");
            assertTrue(Modifier.isPublic(method.getModifiers()),
                    "countWords(String) must be public");
        } catch (NoSuchMethodException e) {
            fail("Counter interface must declare: int countWords(String sentence);");
        }
    }


    @Test
    @DisplayName("Counter declares countLetters(String) returning int")
    void testCountLettersDeclaration() {
        try {
            Method method = Counter.class.getMethod("countLetters", String.class);
            assertEquals(int.class, method.getReturnType(),
                    "countLetters(String) must return an int");
            assertTrue(Modifier.isPublic(method.getModifiers()),
                    "countLetters(String) must be public");
        } catch (NoSuchMethodException e) {
            fail("Counter interface must declare: int countLetters(String sentence);");
        }
    }


    @Test
    @DisplayName("Counter declares getLength(String) returning int")
    void testGetLengthDeclaration() {
        try {
            Method method = Counter.class.getMethod("getLength", String.class);
            assertEquals(int.class, method.getReturnType(),
                    "getLength(String) must return an int");
            assertTrue(Modifier.isPublic(method.getModifiers()),
                    "getLength(String) must be public");
        } catch (NoSuchMethodException e) {
            fail("Counter interface must declare: int getLength(String sentence);");
        }
    }


    @Test
    @DisplayName("Counter can be implemented as a polymorphic contract type")
    void testPolymorphicContract() {
        try {
            Counter.class.getMethod("countWords", String.class);
            Counter.class.getMethod("countLetters", String.class);
            Counter.class.getMethod("getLength", String.class);
        } catch (NoSuchMethodException e) {
            fail("Cannot verify polymorphic contract until all three methods are declared in Counter: countWords, countLetters, getLength");
        }
    }
}