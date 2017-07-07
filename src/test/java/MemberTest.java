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

  @Test
  public void all_returnsAllInstancesOfMember_true()  {
    Member firstMember = new Member("Joel Bakken");
    Member secondMember = new Member("Kelle Luoma");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void clear_emptiesAllMembersFromArrayList_0()  {
    Member myMember = new Member("Joel Bakken");
    Member.clear(); //Remember,the test will fail without this line! We need to empty leftover Members from previous tests!
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_membersIstantiateWithAnID_1() {
    Member.clear();
    Member myMember = new Member("Joel Bakken");
    assertEquals(1, myMember.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_secondMember() {
    Member firstMember = new Member("Joel Bakken");
    Member secondMember = new Member("Kelle Luoma");
    assertEquals(Member.find(secondMember.getId()), secondMember);
  }

}
