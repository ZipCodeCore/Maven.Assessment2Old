package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable{

    List<T> occupants;

    public Shelter() {
        occupants = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return occupants.size();
    }

    public void add(Object object) {
        occupants.add((T)object);
    }

    public Boolean contains(Object object) {
        return occupants.contains(object);
    }

    public void remove(Object object) {
        occupants.remove(object);
    }

    public Object get(Integer index) {
        return occupants.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return occupants.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return occupants.iterator();
    }
}