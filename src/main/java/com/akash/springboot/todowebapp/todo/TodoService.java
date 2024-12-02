package com.akash.springboot.todowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	// Creating static todos list to show here
	private static int todosCount = 0;
	static {
		todos.add(new Todo(++todosCount, "akash", "leanr Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "vikas", "leanr Python", LocalDate.now().plusYears(1), true));
		todos.add(new Todo(++todosCount, "annu", "learn C", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUserName(String username) {
		return todos;
	}
	
	// Add todo function
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	
	//deleting by id
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	
	//find by id
	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	
	// a very lazy method as first 
	// we are deleting then creating a new one.
	// this has to change.
	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
}
