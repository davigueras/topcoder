package srm150div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WidgetRepairsTest</code> contains tests for the class <code>{@link WidgetRepairs}</code>.
 *
 * @generatedBy CodePro at 9/08/13 12:07
 */
public class WidgetRepairsTest {
	/**
	 * Run the int days(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	@Test 
	public void testDays_1()
		throws Exception {
		WidgetRepairs fixture = new WidgetRepairs();
		int[] arrivals = { 10, 0, 0, 4, 20 };
		int numPerDay = 8;

		int result = fixture.days(arrivals, numPerDay);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * Run the int days(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	@Test
	public void testDays_2()
		throws Exception {
		WidgetRepairs fixture = new WidgetRepairs();
		int[] arrivals = { 0, 0, 0 };
		int numPerDay = 10;

		int result = fixture.days(arrivals, numPerDay);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int days(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	@Test
	public void testDays_3()
		throws Exception {
		WidgetRepairs fixture = new WidgetRepairs();
		int[] arrivals = { 100, 100 };
		int numPerDay = 10;

		int result = fixture.days(arrivals, numPerDay);

		// add additional test code here
		assertEquals(20, result);
	}

	/**
	 * Run the int days(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	@Test
	public void testDays_4()
		throws Exception {
		WidgetRepairs fixture = new WidgetRepairs();
		int[] arrivals = { 27, 0, 0, 0, 0, 9 };
		int numPerDay = 9;

		int result = fixture.days(arrivals, numPerDay);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int days(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	@Test
	public void testDays_5()
		throws Exception {
		WidgetRepairs fixture = new WidgetRepairs();
		int[] arrivals = { 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 };
		int numPerDay = 3;

		int result = fixture.days(arrivals, numPerDay);

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
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
	 * @generatedBy CodePro at 9/08/13 12:07
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
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WidgetRepairsTest.class);
	}
}