package com.cg.business;

import java.util.ArrayList;
import java.util.List;

import com.cg.data.api.ToDoService;

public class ToDoBusinessImpl {
	ToDoService toDoService;
	public ToDoBusinessImpl(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}
	public List<String> retrieveToDosRelatedToSpring(String user){
		List<String> filteredToDos = new ArrayList<String>();
		List<String> toDos = toDoService.retrieveToDos(user);
		for (String toDo : toDos) {
			if(toDo.contains("Spring")) {
				filteredToDos.add(toDo);
			}
		}
		return filteredToDos;
	}
}
