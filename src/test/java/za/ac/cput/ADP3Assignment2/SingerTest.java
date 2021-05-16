package za.ac.cput.ADP3Assignment2;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Marchello Carolus 218234457
//List and Collection

class SingerTest {

    List<Singer> listStrings = new ArrayList<>();

    @Test
    public void test() {

        //List_____________________________________________________

        Singer singer1 = new Singer("Lethan");
        Singer singer2 = new Singer("Deon");
        Singer singer3 = new Singer("Wes");
        Singer singer4 = new Singer("Conrey");

        //add______________________________________________________
        listStrings.add(singer1);
        listStrings.add(singer2);
        listStrings.add(singer3);
        listStrings.add(singer4);

        System.out.println("List objects: " + listStrings);

        //test case for add
        assertEquals(4, listStrings.size());

        //remove___________________________________________________
        listStrings.remove(singer2);

        System.out.println("List objects after remove: " + listStrings);

        //test case fo remove
        assertEquals(3, listStrings.size());

        System.out.println("Find for List: ");
        //find______________________________________________________
        if(listStrings.contains(singer1)) {
            //test case for find
            assertEquals(true, listStrings.contains(singer1));
            System.out.println("Found it, its in the list <3");
        } else
            System.out.println("Sorry try another word! :)");

        //test case for find
        assertEquals(true, listStrings.contains(singer1));



        //Collections________________________________________________
        System.out.println("Collections: ");
        Collection<Integer> numbers = new ArrayList<>();

        //add________________________________________________________
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Collection arrayList: " + numbers);

        //add test case
        assertEquals(5, numbers.size());


        //remove_____________________________________________________

        numbers.remove(1);
        System.out.println("Collection arraylist after remove: " + numbers);

        //test case for remove
        assertEquals(4, numbers.size());

        //find________________________________________________________
        System.out.println("Find for Collection: ");
        if(numbers.contains(1)){
            //test case for find
            assertEquals(true, numbers.contains(1));
            System.out.println("The number is in the arrayList :)");
        }
            else{
            System.out.println("number not is the arraylist!");
            }

        }

    }

