package ir.amv.snippets.buildjenk;

import net.jcip.annotations.NotThreadSafe;
import org.junit.jupiter.api.Test;

/**
 * @author Amir
 */
@NotThreadSafe
public class MyClass3Test {

    @Test
    public void test3() {
        MyClassTest.openPort(2);
    }

}
