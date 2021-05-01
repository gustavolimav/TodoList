package com.poo.todolist;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private ArrayList<Todo> todos = new ArrayList<>();

    @PostMapping("/{titulo}/{texto}")
    public Todo adicionar(@PathVariable String titulo, @PathVariable String texto) {
        Todo todo = new Todo();
        todo.setTitulo(titulo);
        todo.setTexto(texto);
        todos.add(todo);
        return todo;
    }

    @GetMapping()
    public ArrayList<Todo> listar() {
        return todos;
    }
    
    

}
