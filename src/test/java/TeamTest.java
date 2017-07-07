import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("GUI");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getName_teamInstantiatesWithName_GUI() {
    Team testTeam = new Team("GUI");
    assertEquals("GUI", testTeam.getName());
  }

}
