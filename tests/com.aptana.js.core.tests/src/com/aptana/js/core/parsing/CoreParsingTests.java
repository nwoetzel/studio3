package com.aptana.js.core.parsing;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({JSFlexScannerTest.class, JSParserTest.class, SDocNodeAttachmentTest.class, })
public class CoreParsingTests
{

//	public static Test suite()
//	{
//		TestSuite suite = new TestSuite(CoreParsingTests.class.getName())
//		{
//			@Override
//			public void runTest(Test test, TestResult result)
//			{
//				System.err.println("Running test: " + test.toString());
//				super.runTest(test, result);
//			}
//		};
//		//$JUnit-BEGIN$
//		suite.addTestSuite(JSFlexScannerTest.class);
//		suite.addTestSuite(JSParserTest.class);
//		suite.addTestSuite(SDocNodeAttachmentTest.class);
//		//$JUnit-END$
//		return suite;
//	}
//
}
