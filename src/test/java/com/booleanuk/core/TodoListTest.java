package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddingTask1() {
        TodoList todo = new TodoList();

        Assertions.assertTrue(todo.addToTodo("clean"));
    }

    @Test
    public void testAddingTask2() {
        TodoList todo = new TodoList();

        Assertions.assertTrue(todo.addToTodo("wash"));
    }

    @Test
    public void isDisplayNotEmpty(){
        TodoList todo = new TodoList();

        todo.addToTodo("clean");
        todo.addToTodo("wash");

        Assertions.assertFalse(todo.list.isEmpty());

    }
    @Test
    public void testDisplayText() {
        TodoList todo = new TodoList();

        todo.addToTodo("clean");
        todo.addToTodo("wash");

        Assertions.assertEquals(todo.displayTodo(), "[wash, clean]");
    }
    @Test
    public void testDisplayText4() {
        TodoList todo = new TodoList();

        todo.addToTodo("clean");
        todo.addToTodo("wash");
        todo.addToTodo("shop");
        todo.addToTodo("cook");

        Assertions.assertEquals(todo.displayTodo(), "[shop, cook, wash, clean]");
    }

    @Test
    public void testChangeStatusComplete() {
        TodoList todo = new TodoList();

        todo.addToTodo("wash");
        todo.statusComplete("wash");
        Assertions.assertEquals(todo.list.get("wash"), "Complete");
    }
    @Test
    public void testChangeStatusIncomplete() {
        TodoList todo = new TodoList();

        todo.addToTodo("wash");
        todo.statusComplete("wash");
        todo.statusIncomplete("wash");
        Assertions.assertEquals(todo.list.get("wash"), "Incomplete");
    }
    @Test
    public void testChangeStatus() {
        TodoList todo = new TodoList();

        todo.addToTodo("wash");

        Assertions.assertEquals(todo.list.get("wash"), "Incomplete");
        todo.changeStatus("wash");
        Assertions.assertEquals(todo.list.get("wash"), "Complete");
    }

    public void getIncompleteStatus() {
        TodoList todo = new TodoList();

        todo.statusComplete("wash");
        todo.statusIncomplete("wash");
        Assertions.assertEquals(todo.list.get("wash"), "Incomplete");
    }

}
