package listasYcolecciones;

import java.util.TreeSet;

class Instituto5_treeSet {

    public static void main(String[] args) {
        
        TreeSet<String> name = new TreeSet<>();

        name.add("pastor");
        name.add("natacha");
        name.add("pancy");
        name.add("leopoldo");
        name.add("saray");

        System.out.println(name);

        System.out.println(name.higher("volt"));// me tiro null


        TreeSet<Integer> number = new TreeSet<>();

        number.add(8);
        number.add(3);
        number.add(7);
        number.add(2);
        number.add(5);

        System.out.println(number.ceiling(4));
        System.out.println(number.ceiling(5));
        System.out.println(number.floor(4));
        System.out.println(number.floor(5));
        System.out.println(number.lower(8));
        System.out.println(number.higher(2));
        System.out.println(number.lower(8));
        System.out.println(number.higher(2));
        System.out.println(number);

    }
}