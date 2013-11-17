package srm147div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PeopleCircleTest</code> contains tests for the class <code>{@link PeopleCircle}</code>.
 *
 * @generatedBy CodePro at 5/08/13 22:25
 */
public class PeopleCircleTest {
	/**
	 * Run the String order(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 22:25
	 */
	@Test
	public void testOrder_1()
		throws Exception {
		PeopleCircle fixture = new PeopleCircle();
		int numMales = 5;
		int numFemales = 3;
		int K = 2;

		String result = fixture.order(numMales, numFemales, K);

		// add additional test code here
		assertEquals("MFMFMFMM", result);
	}

	/**
	 * Run the String order(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 22:25
	 */
	@Test
	public void testOrder_2()
		throws Exception {
		PeopleCircle fixture = new PeopleCircle();
		int numMales = 7;
		int numFemales = 3;
		int K = 1;

		String result = fixture.order(numMales, numFemales, K);

		// add additional test code here
		assertEquals("FFFMMMMMMM", result);
	}

	/**
	 * Run the String order(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 22:25
	 */
	@Test
	public void testOrder_3()
		throws Exception {
		PeopleCircle fixture = new PeopleCircle();
		int numMales = 25;
		int numFemales = 25;
		int K = 1000;

		String result = fixture.order(numMales, numFemales, K);

		// add additional test code here
		assertEquals("MMMMMFFFFFFMFMFMMMFFMFFFFFFFFFMMMMMMMFFMFMMMFMFMMF", result);
	}

	/**
	 * Run the String order(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 22:25
	 */
	@Test
	public void testOrder_4()
		throws Exception {
		PeopleCircle fixture = new PeopleCircle();
		int numMales = 5;
		int numFemales = 5;
		int K = 3;

		String result = fixture.order(numMales, numFemales, K);

		// add additional test code here
		assertEquals("MFFMMFFMFM", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/08/13 22:25
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
	 * @generatedBy CodePro at 5/08/13 22:25
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
	 * @generatedBy CodePro at 5/08/13 22:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PeopleCircleTest.class);
	}
}