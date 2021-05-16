package za.ac.cput.ADP3Assignment2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

//Marchello Carolus 218234457
//Set and Map Collection

class ShoeBrandsTest {

    @Test
    void test() {

        Set<ShoeBrands> shoeBrandsSet = new HashSet<>();
        Map<Integer, ShoeBrands> shoeBrandsMap = new HashMap<>();

        ShoeBrands s1 = new ShoeBrands("Nike", 22);
        ShoeBrands s2 = new ShoeBrands("Puma", 20);
        ShoeBrands s3 = new ShoeBrands("Jordan", 23);
        ShoeBrands s4 = new ShoeBrands("Reebok", 21);

        //add for Set__________________________________________________________________
        shoeBrandsSet.add(s1);
        shoeBrandsSet.add(s2);
        shoeBrandsSet.add(s3);
        shoeBrandsSet.add(s4);

        //add for Map
        shoeBrandsMap.put(22, s1);
        shoeBrandsMap.put(20, s2);
        shoeBrandsMap.put(23, s3);
        shoeBrandsMap.put(21, s4);

        System.out.println("Set objects: " + shoeBrandsSet);
        System.out.println("Map objects: " + shoeBrandsMap);

        //test case for add(Set and Map)
        assertEquals(4, shoeBrandsSet.size());

        assertEquals(4, shoeBrandsMap.size());


        //remove for Set and Map__________________________________________________________
        shoeBrandsSet.remove(s1);
        shoeBrandsMap.remove(20);
        System.out.println("Set objects after remove : " + shoeBrandsSet);
        System.out.println("Map objects after remove: " + shoeBrandsMap);

        //test case for remove(Set and Map)
        assertEquals(3, shoeBrandsSet.size());

        assertEquals(3, shoeBrandsMap.size());


        //find for Set_____________________________________________________________
        System.out.println("Find for Set: ");

        if (shoeBrandsSet.contains(s2)) {
            //test case find for Set___________________________________________________
            assertEquals(true, shoeBrandsSet.contains(s2));
            System.out.println("The object is in the list ");
        } else {
            System.out.println("Its not in the list");
        }


        //find for Map_____________________________________________________________
        System.out.println("Find for Map: ");

        if(shoeBrandsMap.containsKey(20)){
            //test case find for Map_______________________________________________
            assertEquals(true, shoeBrandsMap.containsKey(20));
            System.out.println("Its in the List");
        }
        else{
            System.out.println("Its not in the list");
        }



    }

}