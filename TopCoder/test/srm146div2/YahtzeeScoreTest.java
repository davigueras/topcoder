package srm146div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>YahtzeeScoreTest</code> contains tests for the class <code>{@link YahtzeeScore}</code>.
 *
 * @generatedBy CodePro at 17/10/13 12:31
 * @author David
 * @version $Revision: 1.0 $
 */
public class YahtzeeScoreTest {
	/**
	 * Run the int maxPoints(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/10/13 12:31
	 */
	@Test
	public void testMaxPoints_1()
		throws Exception {
		YahtzeeScore fixture = new YahtzeeScore();
		int[] toss = { 2, 2, 3, 5, 4 };

		int result = fixture.maxPoints(toss);

		// add additional test code here
		assertEquals(5, result);
	}

	@Test
	public void testMaxPoints_2()
		throws Exception {
		YahtzeeScore yahtzeeScore = new YahtzeeScore();
		int[] toss = { 6, 4, 1, 1, 3 };
		int result = yahtzeeScore.maxPoints(toss);
		assertEquals(6, result);
	}

	@Test
	public void testMaxPoints_3()
		throws Exception {
		YahtzeeScore yahtzeeScore = new YahtzeeScore();
		int[] toss = { 5, 3, 5, 3, 3 };
		int result = yahtzeeScore.maxPoints(toss);
		assertEquals(10, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/10/13 12:31
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
	 * @generatedBy CodePro at 17/10/13 12:31
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
	 * @generatedBy CodePro at 17/10/13 12:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(YahtzeeScoreTest.class);
	}
}