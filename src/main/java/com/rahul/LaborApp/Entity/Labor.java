package com.rahul.LaborApp.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Labor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    int work_hours;
    int price;
/*Setter Methods in case if lambok does not work*/
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWorkingHours(int work_hours){
        this.work_hours=work_hours;
    }
    public void setPrice(int price){
        this.price=price;
    }

    /*Getter Method*/
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWorkHours(){
        return work_hours;
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
