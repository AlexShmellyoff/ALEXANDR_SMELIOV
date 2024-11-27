package homework_nr_9;

import java.util.ArrayList;

public class TodoList {

    public static void main(String[] args) {
        ArrayList<String> todoList = createTodoList();

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
    }

    public static ArrayList<String> createTodoList() {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Понять домашнее задание");
        todoList.add("Написать код");
        todoList.add("Отправить домашнее задание");
        return todoList;
    }
}
