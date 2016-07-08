package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GenerateUIDTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		GenerateUID obj = new GenerateUID();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}
	@Test
	public void invalid_testLengthOfTheUniqueKey() {

		GenerateUID obj = new GenerateUID();
		Assert.assertEquals(50, obj.generateUniqueKey().length());
	} 
	@Test
	public void testCompareUniqueKey() {

		GenerateUID obj = new GenerateUID();
		assertEquals("afaewn54jknakjsdf", obj.generateUniqueKey());
	} 
}
