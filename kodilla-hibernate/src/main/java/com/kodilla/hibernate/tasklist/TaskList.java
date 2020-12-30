package com.kodilla.hibernate.tasklist;

import javax.validation.constraints.NotNull;
import javax.persistence.*;


@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;
    @Column(name = "LISTNAME")
    private String listName;
    @Column(name = "DESCRIPTION")
    private String description;

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
