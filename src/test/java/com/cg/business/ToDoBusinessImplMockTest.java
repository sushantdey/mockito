package com.cg.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cg.data.api.ToDoService;
import com.cg.data.api.ToDoServiceStub;

public class ToDoBusinessImplMockTest {

	@Test
	public void testRetrieveToDosRelatedToSpringUsingAMock() {
		//ToDoService toDoServiceStub = new ToDoServiceStub();
		ToDoService toDoServiceMock = mock(ToDoService.class);
		List<String> toDos = Arrays.asList("Learn Spring","Learn SpringBoot","Learn Mockito");
		when(toDoServiceMock.retrieveToDos("dummy")).thenReturn(toDos);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filteredToDos = toDoBusinessImpl.retrieveToDosRelatedToSpring("dummy");
		assertEquals(2, filteredToDos.size());
	}
	@Test
	public void testRetrieveToDosRelatedToSpringWithEmptyList() {
		//ToDoService toDoServiceStub = new ToDoServiceStub();
		ToDoService toDoServiceMock = mock(ToDoService.class);
		List<String> toDos = Arrays.asList();
		when(toDoServiceMock.retrieveToDos("dummy")).thenReturn(toDos);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filteredToDos = toDoBusinessImpl.retrieveToDosRelatedToSpring("dummy");
		assertEquals(0, filteredToDos.size());
	}


}
