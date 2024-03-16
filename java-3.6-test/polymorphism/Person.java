package polymorphism;

import javax.sound.midi.Soundbank;

public class Person{

    protected String name;
    private int birthYear;

    public Person(){

    }

   
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        if (birthYear < 1900 || birthYear >2023){
            System.out.println("Invalid BirthYear");
            return;
        }
        this.birthYear = birthYear;
    }

    public void greet(){
        System.out.println("My name is " + this.name + " my birthyear is : "+ this.birthYear  +"\n" + this.getClass().getName());
    }

    public void doWork(){
        System.out.println(this.name + " is working ");
    }

    public void doWork(String work){
        System.out.println(this.name + " is doing " + work);

    }


}



