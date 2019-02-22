package com.todolist.task;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {
    public Task() {
    }

    public Task(String task) {
        this.task = task;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskId")
    private int taskId;

    @Column(name = "task")
    private String task;

    @Column(name = "assignedDate")
    private Date assignedDate;

    public String getTask() {
        return task;
    }
}
