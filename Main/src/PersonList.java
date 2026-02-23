/**
 * Interface for a collection of Person objects.
 */
public interface PersonList {

    /**
     * Adds a Person to the collection.
     * @param p the Person to add
     */
    public void add(Person p);

    /**
     * Returns the Person at the specified index.
     * @param index the index of the Person to retrieve
     * @return the Person at the given index
     */
    public Person get(int index);

}