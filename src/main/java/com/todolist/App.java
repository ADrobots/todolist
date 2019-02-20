package com.todolist;

import com.todolist.da.HibernateService;

public class App {
    public static void main(String[] args) {
        HibernateService.getSessionFactory();
    }
}
