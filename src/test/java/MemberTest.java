import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Joel Bakken");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithDescription_String() {
    Member myMember = new Member("Joel Bakken");
    assertEquals("Joel Bakken", myMember.getDescription());
  }

  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    Member myMember = new Member("Joel Bakken");
    assertEquals(false, myMember.isCompleted());
  }

  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Member myMember = new Member("Joel Bakken");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myMember.getCreatedAt().getDayOfWeek());
  }

  
}
