package com.cg.business;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	@Test
	public void letsMockListSizeMethodReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	@Test
	public void letsMockListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("Sushant");
		assertEquals("Sushant", listMock.get(0));
		assertEquals("Sushant", listMock.get(1));
	}
	@Test(expected = RuntimeException.class)
	public void letsMockListGetMethodThrowException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
		listMock.get(0);
	}
}
