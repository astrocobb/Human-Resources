/**
 *
 */
public class Person {

    private String name;
    private double height;
    private double weight;

    @Override
    public String toString() {
        return "Name: " + name + ", Height: " + height + ", Weight: " + weight;
    }

    /**
     *
     * @param name
     * @param height
     * @param weight
     */
    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    // Setters
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
}