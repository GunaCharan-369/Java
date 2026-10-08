import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> animals = new HashSet<>();

        // add()
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Zebra");
        animals.add("Lion");       // Duplicate is ignored

        System.out.println("Animals: " + animals);

        // contains()
        System.out.println("Contains Tiger? "
                           + animals.contains("Tiger"));

        System.out.println("Contains Horse? "
                           + animals.contains("Horse"));

        // size()
        System.out.println("Number of animals: " + animals.size());

        // remove()
        animals.remove("Zebra");
        System.out.println("After removing Zebra: " + animals);

        // isEmpty()
        System.out.println("Is HashSet empty? " + animals.isEmpty());

        // clear()
        animals.clear();
        System.out.println("After clear: " + animals);

        // Check again
        System.out.println("Is HashSet empty now? "
                           + animals.isEmpty());
    }
}