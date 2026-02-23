import java.util.ArrayList;


/**
 *
 */
public class PersonSet implements PersonList {

    protected ArrayList<Person> people = new ArrayList<>();

    /**
     *
     * @param p
     */
    @Override
    public void add(Person p) {
        if (!(people.contains(p))) {
            people.add(p);
        }
    }

    /**
     *
     * @param index
     */
    @Override
    public Person get(int index) {
        return people.get(index);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : people) {
            sb.append(p.toString());
        }
        return sb.toString();
    }
}