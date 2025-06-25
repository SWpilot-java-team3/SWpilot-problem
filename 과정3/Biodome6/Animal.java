package 과정3.Biodome6;

public class Animal {
    String name;
    String species;
    int age;

    public Animal(String name, String species, int age)
    {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    void displayInfo()
    {
        System.out.printf("[%s(%s, %d살)]", name, species, age);
    }

    String getSpecies(){
        return this.species;
    }
    int getAge(){
        return this.age;
    }
}
