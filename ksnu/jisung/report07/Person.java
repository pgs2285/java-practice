package ksnu.jisung.report07;

class Person {
    String citizenNumber;
    String name;
    int birthyear;
    int classify;
    public String toString(){
        return " " + citizenNumber +" "+ name+" "+ birthyear;
    };
}

class Student extends Person{
    int studentNumber;
    String dept;
    public String toString(){
        return " " + citizenNumber +" "+ name+" "+ birthyear+" "+ studentNumber+" "+ dept;
    }
}

class Researcher extends Person{
    int employeeNumber;
    String dept;
    public String toString(){
        return " " + citizenNumber +" "+ name+" "+ birthyear+" "+ employeeNumber+" "+ dept;
    }
}

class Professor extends Researcher{
    String position;
    public String toString(){
        return " " + citizenNumber +" "+ name+" "+ birthyear+" "+ position+" "+ dept;
    }
}

