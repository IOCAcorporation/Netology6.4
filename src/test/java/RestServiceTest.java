import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RestServiceTest {
    @Test
    public void shouldCalculateForRegistredAndOverLimit() {
        RestService service = new RestService();
        long expected = 9;
        int actual = service.calculate(120_000, 30_000);
        Assertions.assertEquals(expected, actual);

    }
}

