import org.example.StatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void sumTest(){
        StatService statService = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = statService.sum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void sredStoimTest(){
        StatService statService = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 15;
        long actualSum = statService.sredStoim(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void maxValueMounthTest(){
        StatService statService = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};

        long expectedSum = 6;
        long actualSum = statService.maxValueMounth(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void minValueMounthTest(){
        StatService statService = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 9;
        long actualSum = statService.minValueMounth(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void countMounthNijeSredTest(){
        StatService statService = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 5;
        long actualSum = statService.countMounthNijeSred(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void countMounthVisheSredTest(){
        StatService statService = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 5;
        long actualSum = statService.countMounthVisheSred(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
