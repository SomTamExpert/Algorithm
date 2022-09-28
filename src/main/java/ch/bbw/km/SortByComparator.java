package ch.bbw.km;

import java.util.Comparator;

/**
 * Class for sorting Person class by specific parameters
 *
 * @author marco
 * @version 28.09.2022
 */
public class SortByComparator implements Comparator<Person> {

//Aufgabe 4.3
//    public int compare(Person p1, Person p2) {
//        int result = p1.getLastname().compareTo(p2.getLastname());
//        if (result == 0) {
//            result = p1.getFirstname().compareTo(p2.getFirstname());
//        }
//        return result;
//    }

    //Aufgabe 4.4
    //compare by height and then by shoe size
    public int compare(Person p1, Person p2) {
        int result = Integer.compare(p1.getShoeSize(), p2.getShoeSize());
        if (result == 0) {
            result = Double.compare(p1.getHeight(), p2.getHeight());
        }
        return result;
    }
}
