package com.cg.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

import com.cg.data.api.ToDoService;
import com.cg.data.api.ToDoServiceStub;

public class ToDoBusinessImplStubTest {

	@Test
	public void testRetrieveToDosRelatedToSpringUsingStub() {
		ToDoService toDoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);
		List<String> filteredToDos = toDoBusinessImpl.retrieveToDosRelatedToSpring("dummy");
		assertEquals(2, filteredToDos.size());
	}

}
