package ir.amv.snippets.buildjenk;

import net.jcip.annotations.NotThreadSafe;
import org.junit.jupiter.api.Test;

/**
 * @author Amir
 */
@NotThreadSafe
public class MyClass2Test {

    @Test
    public void test2() {
        MyClassTest.openPort(1);
    }

}
