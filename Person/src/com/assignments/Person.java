package com.assignments;


public class Person {
    private String firstName;

    public String getFirstName() {
        if (!firstName.isEmpty())

        return firstName;
        else return "";
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if(!lastName.isEmpty()){
            return lastName;

        }else return "";

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age >100) age=0;
        else
        this.age = age;
    }

    private String lastName;
    private int age;

    public boolean isTeen(){
        if (age<20 && age>12){
            return true;
        } else
            return false;
    }
    public String getFullName(){
        if ((!firstName.isEmpty() && !lastName.isEmpty())){
            return firstName.concat( " " ).concat( lastName );

        } else if (firstName.isEmpty() && !lastName.isEmpty()) return lastName;
        else if (lastName.isEmpty() && !firstName.isEmpty()) return firstName;
        else return "";


}

}
