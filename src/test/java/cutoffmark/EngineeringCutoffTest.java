package cutoffmark;
import static org.java.jupiter.api.Assertions.*;
import org.java.jupiter.api.BeforeAll;
import org.java.jupiter.api.Test;
class EngineeringCutoffTest {
	static EngineeringCutoff cm;
@BeforeAll
static void setUpBeforeClass () throws Exception{
	cm = new EngineeringCutoff();
}
@Test
void CutoffMarkTest() {
	assertEquals(92,cm.CutoffMark(94,85,97));
}

}
