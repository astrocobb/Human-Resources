/**
 * A PersonSet that converts each added Person's height from
 * centimeters to inches and weight from kilograms to pounds
 * before storing it. Duplicate handling is inherited from PersonSet.
 */
public class PersonImperialSet extends PersonSet {

    private static final double CM_PER_INCH = 2.54;
    private static final double LB_PER_KG = 2.20462;

    /**
     * Converts the Person's measurements to imperial units, then
     * delegates to PersonSet.add (which handles duplicate rejection).
     * @param p the Person to add (mutated in place to imperial units)
     */
    @Override
    public void add(Person p) {
        p.setHeight(convertHeight(p.getHeight()));
        p.setWeight(convertWeight(p.getWeight()));
        super.add(p);
    }

    private double convertHeight(double height) {
        return height / CM_PER_INCH;
    }

    private double convertWeight(double weight) {
        return weight * LB_PER_KG;
    }

    @Override
    protected String getHeader() {
        return String.format("%-10s%-15s%-15s", "Name", "Height (in)", "Weight (lb)");
    }
}
