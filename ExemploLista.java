import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class ExemploList {
    public static void main(String[] args){

        List<Double> grades = new ArrayList<Double>();
        grades.add(7d);
        grades.add(8.5);
        grades.add(9.3);
        grades.add(5.0);
        grades.add(7d);
        grades.add(0.0);
        grades.add(3.6);
        System.out.println("The grades are " + grades.toString());

        System.out.println("Show the position of the grade 5.0: " + grades.indexOf(5.0));

        System.out.println("Add the grade 8.0 in the 4th position: ");
        grades.add(4, 8.0);
        System.out.println(grades);

        System.out.println("Substitute the grade 5.0 for 6.0: ");
        grades.set(grades.indexOf(5.0), 6.0);
        System.out.println(grades);

        System.out.println("Verify if the grade 5.0 is in the list: " + grades.contains(5d));

        System.out.println("Show all the grades in the order they were added: ");
        for (Double grade: grades) System.out.println(grade);

        System.out.println("Show the 3rd grade added: " + grades.get(2));
        System.out.println(grades.toString());

        System.out.println("Show the minimum grade: " + Collections.min(grades));
        System.out.println("Show the maximum grade: " + Collections.max(grades));

        System.out.println("Show the sum of the values: ");
        Iterator<Double> iterator = grades.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Show the average grade: " + (soma/grades.size()));

        System.out.println("Remove the grade 0.0: ");
        grades.remove(0.0);
        System.out.println(grades);

        System.out.println("Remove the grade in the position 0: ");
        grades.remove(0);
        System.out.println(grades);

        System.out.println("Remove the grades lower than 7.0: ");
        Iterator<Double> iterator1 = grades.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7.0) iterator1.remove();
        }
        System.out.println(grades);

        System.out.println("Erase all the list: ");
        grades.clear();
        System.out.println(grades);

        System.out.println("Verify if the list is empty: " + grades.isEmpty());

        /*Resolve these exercises using LinkedList: */

        System.out.println("Create a list called grades2: ");
        LinkedList<Double> grades2 = new LinkedList<Double>();
        grades2.add(9.5);
        grades2.add(3.5);
        grades2.add(6.3);
        grades2.add(10d);
        grades2.add(4.0);
        grades2.add(9.9);
        System.out.println(grades2);


        System.out.println("Show the first grade of the new list without removing it: " + grades2.getFirst());

        grades2.removeFirst();
        System.out.println("Show the first grade of the new list, removing it: ");
        System.out.println(grades2);


    }
}