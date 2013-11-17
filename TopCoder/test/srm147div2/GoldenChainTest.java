package srm147div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GoldenChainTest</code> contains tests for the class <code>{@link GoldenChain}</code>.
 *
 * @generatedBy CodePro at 8/08/13 14:24
 */
public class GoldenChainTest {
	/**
	 * Run the int minCuts(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	@Test
	public void testMinCuts_1()
		throws Exception {
		GoldenChain fixture = new GoldenChain();
		int[] sections = {3,3,3,3};

		int result = fixture.minCuts(sections);

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int minCuts(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	@Test
	public void testMinCuts_2()
		throws Exception {
		GoldenChain fixture = new GoldenChain();
		int[] sections = {2000000000};

		int result = fixture.minCuts(sections);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int minCuts(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	@Test
	public void testMinCuts_3()
		throws Exception {
		GoldenChain fixture = new GoldenChain();
		int[] sections = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
38,39,40,41,42,43,44,45,46,47,48,49,50};

		int result = fixture.minCuts(sections);

		// add additional test code here
		assertEquals(42, result);
	}

	/**
	 * Run the int minCuts(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	@Test
	public void testMinCuts_4()
		throws Exception {
		GoldenChain fixture = new GoldenChain();
		int[] sections = {20000000,20000000,2000000000};

		int result = fixture.minCuts(sections);

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int minCuts(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	@Test
	public void testMinCuts_5()
		throws Exception {
		GoldenChain fixture = new GoldenChain();
		int[] sections = {10,10,10,10,10,1,1,1,1,1};

		int result = fixture.minCuts(sections);

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the int minCuts(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	@Test
	public void testMinCuts_6()
		throws Exception {
		GoldenChain fixture = new GoldenChain();
		int[] sections = {1,10};

		int result = fixture.minCuts(sections);

		// add additional test code here
		assertEquals(1, result);
	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 8/08/13 14:24
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
	 * @generatedBy CodePro at 8/08/13 14:24
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
	 * @generatedBy CodePro at 8/08/13 14:24
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GoldenChainTest.class);
	}
}