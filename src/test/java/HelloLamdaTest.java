import dev.rajendra.HelloLamda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloLamdaTest
{

    @Test
public  void testHello(){
        var hello  = new HelloLamda();

        assertEquals("Hello Lamda Iam from Indore",hello.hello("Indore"));
    }
}
