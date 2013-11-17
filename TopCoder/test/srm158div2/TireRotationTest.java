package srm158div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TireRotationTest</code> contains tests for the class <code>{@link TireRotation}</code>.
 *
 * @generatedBy CodePro at 17/11/13 22:59
 * @author David
 * @version $Revision: 1.0 $
 */
public class TireRotationTest {
	/**
	 * Run the int getCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@Test
	public void testGetCycle_1()
		throws Exception {
		TireRotation fixture = new TireRotation();
		String initial = "ABCD";
		String current = "ABCD";

		int result = fixture.getCycle(initial, current);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@Test
	public void testGetCycle_2()
		throws Exception {
		TireRotation fixture = new TireRotation();
		String initial = "ABCD";
		String current = "DCAB";

		int result = fixture.getCycle(initial, current);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@Test
	public void testGetCycle_3()
		throws Exception {
		TireRotation fixture = new TireRotation();
		String initial = "ABCD";
		String current = "CDBA";

		int result = fixture.getCycle(initial, current);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int getCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@Test
	public void testGetCycle_4()
		throws Exception {
		TireRotation fixture = new TireRotation();
		String initial = "ABCD";
		String current = "ABDC";

		int result = fixture.getCycle(initial, current);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getCycle(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@Test
	public void testGetCycle_5()
		throws Exception {
		TireRotation fixture = new TireRotation();
		String initial = "ZAXN";
		String current = "XNAZ";

		int result = fixture.getCycle(initial, current);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 17/11/13 22:59
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TireRotationTest.class);
	}
}