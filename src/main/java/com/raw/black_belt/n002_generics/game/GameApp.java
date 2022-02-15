package com.raw.black_belt.n002_generics.game;

public class GameApp {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 11);
        Schoolar schoolar2 = new Schoolar("Mary", 14);

        Student student1 = new Student("Nikola", 20);
        Student student2 = new Student("Mikola", 18);

        Employee employee1 = new Employee("Xena", 35);
        Employee employee2 = new Employee("Gabriel", 25);

//        Team schoolarTeam = new Team("Dragon");
        Team<Schoolar> schoolarTeam = new Team("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(employee1);
        Team<Student> studentTeam = new Team<>("Still");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);



//        schoolarTeam.playWith(studentTeam);

//        Team<String> anotherTeam = new Team<>("Strings");
//        anotherTeam.addNewParticipant("Hello");


        Team<Schoolar> schoolarTeam2 = new Team("Dragon2");
        schoolarTeam2.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar1);

        schoolarTeam.playWith(schoolarTeam2);
    }

}
