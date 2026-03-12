/**
 * Represents a person with a name, height, and weight.
 * Used to store Nintendo HR data read from hr.txt.
 */
public class Person implements Comparable<Person>{

    private String name;
    private double height;
    private double weight;

    @Override
    public String toString() {
        return name + "\t" + height + "\t" + weight;
    }

    /**
     * Constructs a Person with the given name, height, and weight.
     * @param name   the person's name
     * @param height the person's height in centimeters
     * @param weight the person's weight in kilograms
     */
    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null) return false;

        if (o == this) return true;

        if (!(o instanceof Person)) return false;

        Person p = (Person) o;

        return this.name.equals(p.name)
            && this.height == p.height
            && this.weight == p.weight;
    }

    @Override
    public int compareTo(Person p) {
        return 0;
    }
}