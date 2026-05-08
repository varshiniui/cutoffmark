package cutoffmark;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
