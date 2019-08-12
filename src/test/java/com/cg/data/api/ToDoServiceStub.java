package com.cg.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService{

	public List<String> retrieveToDos(String user) {
		return Arrays.asList("Learn Spring","Learn SpringBoot","Learn Mockito");
	}

}
