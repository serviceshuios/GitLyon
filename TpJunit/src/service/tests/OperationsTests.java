package service.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import service.Operations;

public class OperationsTests {

	@Ignore
	@Test
	public void testAdd() {
		System.out.println("TEST ADD");
		long resultat = Operations.add(10,20,30);
		Assert.assertEquals(resultat, 10+20+30);
	}
	
	@Test
	public void testAdd2() {
		System.out.println("TEST ADD2");
		long resultat = Operations.add(100,20,30);
		Assert.assertEquals(resultat, 100+20+30);
	}
	@Test
	public void testAdd3() {
		System.out.println("TEST ADD3");
		long resultat = Operations.add();
		Assert.assertEquals(resultat, 0);
	}

	@Test
	public void testMult() {
		long resultat = Operations.mult(10,20);
		Assert.assertEquals(resultat, 10*20);
	}

	@Test
	public void testMult2() {
		long resultat = Operations.mult(100,20);
		Assert.assertEquals(resultat, 100*20);
	}
	
	@Test
	public void testMult3() {
		long resultat = Operations.mult();
		Assert.assertEquals(resultat, 0);
	}

	@Before
	public void testBefore(){
		System.out.println(">> AVANT CHAQUE TEST");
	}
	
	@After
	public void testAfter(){
		System.out.println(">> APRES CHAQUE TEST");
	}
	
	@BeforeClass
	public static void testBeforeClass()
	{
		System.out.println("=================================");
		System.out.println(">>>> AVANT CHAQUE SUITE DE TEST");
		System.out.println("=================================");
	}
	@AfterClass
	public static void testAfterClass()
	{
		System.out.println("=================================");
		System.out.println(">>>> APRES CHAQUE SUITE DE TEST");
		System.out.println("=================================");
	}
}
