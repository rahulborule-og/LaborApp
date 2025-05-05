package com.rahul.LaborApp.Entity;


import jakarta.persistence.*;

@Entity
public class Labor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    int work_hours;
    int price;

    public void setId(int id){
        this.id=id;
    }

    public Labor(int id, String name, int age, int work_hours, int price){
        this.id=id;
        this.name=name;
        this.age=age;
        this.work_hours=work_hours;
        this.price=price;

    }
    public Labor(){};
}
