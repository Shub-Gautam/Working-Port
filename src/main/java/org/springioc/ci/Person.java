package org.springioc.ci;

public class Person {
    private String name ;
    private int pId ;

    public Person(String s,int p){
        this.name = s ;
        this.pId = p ;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pId=" + pId +
                '}';
    }

}
