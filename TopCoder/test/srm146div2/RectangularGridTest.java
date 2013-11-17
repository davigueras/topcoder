package srm146div2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RectangularGridTest</code> contains tests for the class <code>{@link RectangularGrid}</code>.
 *
 * @generatedBy CodePro at 17/10/13 13:00
 * @author David
 * @version $Revision: 1.0 $
 */
public class RectangularGridTest {
	/**
	 * Run the long countRectangles(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17/10/13 13:00
	 */
	@Test
	public void testCountRectangles_1()
		throws Exception {
		RectangularGrid fixture = new RectangularGrid();
		int width = 3;
		int height = 3;

		long result = fixture.countRectangles(width, height);

		// add additional test code here
		assertEquals(22, result);
	}

	@Test
	public void testCountRectangles_3()
		throws Exception {
		RectangularGrid rectangularGrid = new RectangularGrid();
		int width = 10;
		int height = 10;
		long result = rectangularGrid.countRectangles(width, height);
		assertEquals(2640, result);
	}

	@Test
	public void testCountRectangles_2
()
		throws Exception {
		RectangularGrid rectangularGrid = new RectangularGrid();
		int width = 5;
		int height = 2;
		long result = rectangularGrid.countRectangles(width, height);
		assertEquals(31, result);
	}

	@Test
	public void testCountRectangles_4()
		throws Exception {
		RectangularGrid rectangularGrid = new RectangularGrid();
		int width = 1;
		int height = 1;
		long result = rectangularGrid.countRectangles(width, height);
		assertEquals(0, result);
	}

	@Test
	public void testCountRectangles_5()
		throws Exception {
		RectangularGrid rectangularGrid = new RectangularGrid();
		int width = 592;
		int height = 964;
		long result = rectangularGrid.countRectangles(width, height);
		assertEquals(81508708664L, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17/10/13 13:00
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
	 * @generatedBy CodePro at 17/10/13 13:00
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
	 * @generatedBy CodePro at 17/10/13 13:00
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RectangularGridTest.class);
	}
}