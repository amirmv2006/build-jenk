package ir.amv.snippets.buildjenk;

import net.jcip.annotations.NotThreadSafe;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Amir
 */
@NotThreadSafe
public class MyClassTest {

    @Test
    public void test1() {
        openPort(0);
    }

    public static void openPort(final int i) {
        try {
            System.out.println("Test" + i + ",Running thread: " + Thread.currentThread().getId());
            ServerSocket serverSocket = new ServerSocket(9889);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    try (Socket s = new Socket("localhost", 9889)){
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 1000);
            Socket accept = serverSocket.accept();
            accept.close();
            serverSocket.close();
            System.out.println("Test" + i + ", Socket closed");
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


}
