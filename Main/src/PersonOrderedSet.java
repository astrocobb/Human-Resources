import java.util.Collections;


/**
 * A PersonSet that keeps its contents sorted alphabetically by name.
 * Duplicate handling is inherited from PersonSet.
 */
public class PersonOrderedSet extends PersonSet {

    /**
     * Adds a Person via the parent (which rejects duplicates),
     * then re-sorts the underlying list.
     * @param p the Person to add
     */
    @Override
    public void add(Person p) {
        super.add(p);
        sort();
    }

    private void sort() {
        Collections.sort(people);
    }
}
