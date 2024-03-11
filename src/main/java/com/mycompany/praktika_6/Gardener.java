package com.mycompany.praktika_6;

import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plant name: ");
        String plantName = scanner.nextLine();

        Plant plant = new Plant(plantName);
        filter(plant);
        
        System.out.println("Plant name: " + plant.getName());
    }

    public static void filter(Plant plant) {
        String newName = plant.getName().replaceAll("[aeiouAEIOU]", "");
        newName += "VGTBL";
        plant.setName(newName);
    }
}
