import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Program1Test{
  Program1 pgm = new Program1();
  @Test
  void checkOutput(){
    int ans = pgm.addTwoNumbers(2,3);
    assertEquals(5,ans);
}
}
