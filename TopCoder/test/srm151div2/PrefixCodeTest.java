package srm151div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WidgetRepairsTest</code> contains tests for the class <code>{@link WidgetRepairs}</code>.
 *
 * @generatedBy CodePro at 9/08/13 12:07
 */
public class PrefixCodeTest {
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
		PrefixCode fixture = new PrefixCode();
		String[] words = {"trivial"};

		String result = fixture.isOne(words);

		// add additional test code here
		assertEquals("Yes", result);
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
		PrefixCode fixture = new PrefixCode();
		String[] words = {"10001", "011", "100", "001", "10"};

		String result = fixture.isOne(words);

		// add additional test code here
		assertEquals("No, 2", result);
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
		PrefixCode fixture = new PrefixCode();
		String[] words = {"no", "nosy", "neighbors", "needed"};
		
		String result = fixture.isOne(words);

		// add additional test code here
		assertEquals("No, 0", result);
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
		PrefixCode fixture = new PrefixCode();
		String[] words = {"1010", "11", "100", "0", "1011"};

		String result = fixture.isOne(words);

		// add additional test code here
		assertEquals("Yes", result);
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
		PrefixCode fixture = new PrefixCode();
		String[] words = {"No", "not"};

		String result = fixture.isOne(words);

		// add additional test code here
		assertEquals("Yes", result);
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
		new org.junit.runner.JUnitCore().run(PrefixCodeTest.class);
	}
}