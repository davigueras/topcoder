package srm147div2;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>CCipherTest</code> contains tests for the class <code>{@link CCipher}</code>.
 *
 * @generatedBy CodePro at 5/08/13 18:31
 * @author David
 * @version $Revision: 1.0 $
 */
public class CCipherTest {
	/**
	 * Run the String decode(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	@Test
	public void testDecode_1()
		throws Exception {
		CCipher fixture = new CCipher();
		String cipherText = "VQREQFGT";
		int shift = 2;

		String result = fixture.decode(cipherText, shift);

		// add additional test code here
		assertEquals("TOPCODER", result);
	}

	/**
	 * Run the String decode(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	@Test
	public void testDecode_2()
		throws Exception {
		CCipher fixture = new CCipher();
		String cipherText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int shift = 10;

		String result = fixture.decode(cipherText, shift);

		// add additional test code here
		assertEquals("QRSTUVWXYZABCDEFGHIJKLMNOP", result);
	}

	/**
	 * Run the String decode(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	@Test
	public void testDecode_3()
		throws Exception {
		CCipher fixture = new CCipher();
		String cipherText = "TOPCODER";
		int shift = 0;

		String result = fixture.decode(cipherText, shift);

		// add additional test code here
		assertEquals("TOPCODER", result);
	}

	/**
	 * Run the String decode(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	@Test
	public void testDecode_4()
		throws Exception {
		CCipher fixture = new CCipher();
		String cipherText = "ZWBGLZ";
		int shift = 25;

		String result = fixture.decode(cipherText, shift);

		// add additional test code here
		assertEquals("AXCHMA", result);
	}

	/**
	 * Run the String decode(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	@Test
	public void testDecode_5()
		throws Exception {
		CCipher fixture = new CCipher();
		String cipherText = "DBNPCBQ";
		int shift = 1;

		String result = fixture.decode(cipherText, shift);

		// add additional test code here
		assertEquals("CAMOBAP", result);
	}
	
	/**
	 * Run the String decode(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	@Test
	public void testDecode_6()
		throws Exception {
		CCipher fixture = new CCipher();
		String cipherText = "LIPPSASVPH";
		int shift = 4;

		String result = fixture.decode(cipherText, shift);

		// add additional test code here
		assertEquals("HELLOWORLD", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/08/13 18:31
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
	 * @generatedBy CodePro at 5/08/13 18:31
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
	 * @generatedBy CodePro at 5/08/13 18:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CCipherTest.class);
	}
}