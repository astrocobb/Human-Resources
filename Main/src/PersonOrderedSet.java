import java.util.Collections;


public class PersonOrderedSet extends PersonSet {

    @Override
    public void add(Person p) {
        if (!(people.contains(p))) {
            super.add(p);
        }

        Collections.sort(people);
    }
}