import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiseTest {

    @Test
    public void borders() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculationOfSquares(200, 300);

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void sameBorders() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculationOfSquares(200, 200);

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void aboveTheMinimum() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculationOfSquares(500, 200);

        Assertions.assertEquals (expected, actual);
    }
}
