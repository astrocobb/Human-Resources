import java.util.ArrayList;


/**
 * A set-like collection of Person objects backed by an ArrayList.
 * Rejects duplicate entries using Person's equals method.
 */
public class PersonSet implements PersonList {

    protected ArrayList<Person> people = new ArrayList<>();

    /**
     * Adds a Person to the set if they are not already present.
     * @param p the Person to add
     */
    @Override
    public void add(Person p) {
        if (!(people.contains(p))) {
            people.add(p);
        }
    }

    /**
     * Returns the Person at the specified index.
     * @param index the index of the Person to retrieve
     * @return the Person at the given index
     */
    @Override
    public Person get(int index) {
        return people.get(index);
    }

    /**
     * Returns a string representation of all Persons in the set.
     * @return concatenated toString output of each Person
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : people) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}