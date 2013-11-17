package test.all;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import srm147div2.CCipherTest;
import srm147div2.GoldenChainTest;
import srm147div2.PeopleCircleTest;
import srm150div2.WidgetRepairsTest;
import srm151div2.PrefixCodeTest;
import srm154div2.ProfitCalculatorTest;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 9/08/13 12:07
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	/* Cal afegir manualment cada nova adicio als sub-TestAll, aixo serveix per 
	 * provar tot el projecte i fer coverage test de tot sencerv */
	
	GoldenChainTest.class,
	PeopleCircleTest.class,
	CCipherTest.class,
	WidgetRepairsTest.class,
	PrefixCodeTest.class,
	ProfitCalculatorTest.class
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 9/08/13 12:07
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
