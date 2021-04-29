package com.poo.todolist;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private ArrayList<Todo> todos = new ArrayList<>();

    @PostMapping("/name")
    public String adicionar(@RequestBody Todo todo) {
        todos.add(todo);
        return "feito";
    }

    @GetMapping("/name")
    public ArrayList<Todo> listarTodo() {
        return todos;
    }
    

}
