package com.example.animals;

import java.util.Objects;

public class Dog {

    private String name;
    private int age;
    private String breed;
    private boolean isVaccinated;

    public Dog(String name, int age, String breed, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isVaccinated = isVaccinated;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void displayInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Raça: " + breed);
        System.out.println("Vacinado: " + (isVaccinated ? "Sim" : "Não"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                isVaccinated == dog.isVaccinated &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, isVaccinated);
    }


}
