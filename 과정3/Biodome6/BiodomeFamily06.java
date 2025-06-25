package 과정3.Biodome6;

import java.util.*;

public class BiodomeFamily06 {
    public static void main(String args[]){


        Animal animal1 = new Animal("제니","원숭이",4);
        Animal animal2 = new Animal("고먀","코끼리",4);
        Animal animal3 = new Animal("타이","호랑이",9);
        Animal animal4 = new Animal("로아","코뿔소",5);
        Animal animal5 = new Animal("바비","사슴",7);

        List<Animal> animals = new LinkedList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println("==========================정렬 전");

        for (Animal s: animals){
            s.displayInfo();
        }
        System.out.println();

        System.out.println("==========================정렬 후");
        sort(animals);
        for (Animal s: animals){
            s.displayInfo();
        }

    }

    public static void sort(List<Animal> animals){
        try{
            for(int i=1; i<animals.size(); i++) {
                if (animals.get(i).getSpecies().equals("호랑이")) {
                    if (animals.get(i - 1).getSpecies().equals("사슴")) {
                        Collections.swap(animals, i - 1, i);
                    } else if (animals.get(i - 1).getSpecies().equals("코끼리") && animals.get(i - 1).getAge() <= 5) {
                        Collections.swap(animals, i - 1, i);
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
