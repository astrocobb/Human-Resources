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
     * Returns the column header for this set's data. Subclasses with
     * different units override this to label the columns appropriately.
     * @return a tab/column-formatted header line (no trailing newline)
     */
    protected String getHeader() {
        return String.format("%-10s%-15s%-15s", "Name", "Height (cm)", "Weight (kg)");
    }

    /**
     * Returns a string representation of all Persons in the set,
     * preceded by a labeled column header.
     * @return header followed by each Person's data, one per line
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getHeader()).append("\n");
        for (Person p : people) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}