import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTRLApp {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTr() {
		assertNotNull(" null", TRLApp.lineB());
	}
	
	@Test
	public void testDt() {
		assertNotNull(" null", TRLApp.lineD());
	}
	
	@Test
	public void testsub() {
		assertNotNull(" null", TRLApp.subMenu());
	}
	
	@Test
	public void testmenu() {
		assertNotNull(" null", TRLApp.menu());
	}
	

	
}
