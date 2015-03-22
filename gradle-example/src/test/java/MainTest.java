import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MainTest {
  @Test
  public void should_return_added_value() {
    assertThat(Main.add(1, 1), is(2));
  }
}
