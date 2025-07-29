package com.exercisesjava.oopconcepts;

public class Student {
    private String Name;
    private String Email;
    private int Room;

    public Student(String name, String email, int room){
        this.Name = name;
        this.Email = email;
        this.Room = room;
    }

    public String getName(){
        return this.Name;
    }

    public String getEmail(){
        return this.Email;
    }

    public int getRoom(){
        return this.Room;
    }
}
