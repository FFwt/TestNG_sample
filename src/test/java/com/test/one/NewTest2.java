package com.test.one;



import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	
	  @Test
	  public void f() {
	  }
	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	/**
	 * @param args
	 */
	@BeforeTest // ���ָ�����в��Խ���ǰ���д� method

	public void beforeAllTest() {

		System.out.println("Before All Test");

	}

	@BeforeMethod // ���ָ��ÿ�����Խ���ǰ���д� method

	public void setUp() {

		System.out.println("Before Each Test Method");

	}

	@Test(groups = { "group4" }) // ���Ϊ���Գ�ʽ����Ϊ���� group1

	public void group1Test() {

		System.out.println("Group 4");

	}

	@Test(groups = { "group5" }) // ���Ϊ���Գ�ʽ����Ϊ���� group2

	public void group2Test() {

		System.out.println("Group 5");

	}

	@Test(groups = { "group6" }) // ���Ϊ���Գ�ʽ����Ϊ���� group3

	public void group3Test() {

		System.out.println("Group 6");

	}

	@Test // �����������Ƿ����
	public void add() {
		assertEquals(6, 6);
	}

	Login log = new Login();
	boolean tt = log.logintest("test", "test");

	@Test // ���Ե�¼�����Ƿ���ȷ
	public void testLogin() {
		assertTrue(tt);
	}

	@AfterMethod // ���ָ��ÿ�����Խ��к���д� method

	public void tearDown() {

		System.out.println("After Each Test Method");

	}

	@AfterTest // ���ָ�����в��Խ��к���д� method

	public void afterAllTest() {

		System.out.println("After All Test");

	}

}
