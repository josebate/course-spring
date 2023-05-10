package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todoCount = 0;

    static{
        todos.add(new Todo(++todoCount, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCount, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoCount, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void deleteByiD(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todoCount, username, description, targetDate, done);
        todos.add(todo);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        deleteByiD(todo.getId());
        todos.add(todo);
    }
}
