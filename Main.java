package com.company;

public class Main {

    public static void main(String[] args) {
        Door interiordoor =DoorFactory.getDoor(new InteriorFactory("Round stationary handles","Latches","Wood"));
        Door lockdoor =DoorFactory.getDoor(new EnteranceFactory("Fale","Cylinder","Metal"));
        System.out.println("AbstractFactory Interior Door characteristics: "+interiordoor);
        System.out.println("AbstractFactory Enterance Door characteristics: "+lockdoor);
    }}
