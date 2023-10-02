package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        try (Scanner input = new Scanner(System.in)) {
            while(true) {
                 System.out.println("\n[1] Dog");
                System.out.println("[2] Cat");
                System.out.println("[3] Exit");
                System.out.print("\nSelection choice: ");
                Integer choice = input.nextInt();

                    if (choice == 3) {
                        System.out.println("-- TERMINATED --");
                        System.exit(0);
                    }
                PetRecord petFile = new PetRecord();
                Pet pet = null;

                switch(choice){
                    case 1: pet = new Dog();
                        petFile.setPetId("D01");
                        petFile.setPetName("Bantay");
                        petFile.setPet(pet);
                        ((Dog) pet).setBreed("German Shepperd");
                        break;
                    case 2: pet = new Cat();
                        petFile.setPetId("C01");
                        petFile.setPetName("Muning");
                        petFile.setPet(pet);
                        ((Cat) pet).setNoOfLives(9);
                        break;
                    default:
                        System.out.println("Invalid.");
                        System.exit(0);
                }
                if (choice != 3) {
                    System.out.println("Pet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    if (pet instanceof Cat) {
                        System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    } else if (pet instanceof Dog) {
                        System.out.println("Breed: " + ((Dog) pet).getBreed());
                    }
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                }
            }
        }
    }
}

       
