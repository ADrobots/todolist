package com.todolist.task;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskId")
    int taskId;

    @Column(name = "task")
    String task;

    @Column(name = "assignedDate")
    Date assignedDate;
}
