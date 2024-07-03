package com.example;

import java.util.HashSet;

import com.example.animals.Dog;

public class Main {
    public static void main(String[] args) {
        

        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever", true);
        Dog dog2 = new Dog("Buddy", 3, "Golden Retriever", true);

        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(dog1);


        System.out.println("dog1 equals dog2: " + dog1.equals(dog2)); 
        System.out.println("Dog set contains dog2: " + dogSet.contains(dog2));  
    }
}