import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void getNumberTest(){
        //GIVEN
        int value = 4;
        //WHEN
        int result = Main.getNumber(value);
        //THEN
        assertEquals(11,result);
    }
}
