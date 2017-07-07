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

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("GUI");
    Team secondTeam = new Team("Graphics");
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }

  @Test
  public void clear_emptiesAllTeamsFromList_0() {
    Team testTeam = new Team("GUI");
    Team.clear();
    assertEquals(Team.all().size(), 0);
  }

  
}
