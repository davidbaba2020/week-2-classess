package taskExample;

import taskExample.enums.Stack;
import taskExample.models.ComparableDecadev;
import taskExample.models.ComparatorDecadev;
import taskExample.models.Decadev;
import taskExample.models.SARATING;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainTask {
    public static void main(String[] args) {
        System.out.println("Hi there");


        //My normal Dev instant
        Decadev dave = new Decadev("David", Stack.JAVA,50.0,60.0,70.0);
        SARATING goodluck = new SARATING("Goodluck", Stack.JAVA);
//        System.out.println(dave);
//        System.out.println(goodluck.generateDevResult(dave));


        //Comparator Devs
        ComparatorDecadev dev1 = new ComparatorDecadev("Nancy",Stack.JAVA,55.0,40.7,60.0);
        ComparatorDecadev dev2 = new ComparatorDecadev("Ben",Stack.JAVA,75.0,60.7,80.0);
        ComparatorDecadev dev3 = new ComparatorDecadev("Dan",Stack.JAVA,75.0,20.7,40.0);
        List<ComparatorDecadev> comparatorDevsList = new ArrayList<>();
        comparatorDevsList.add(dev3);
        comparatorDevsList.add(dev2);
        comparatorDevsList.add(dev1);

        comparatorDevsList.sort(new ComparatorDecadev());
             for (ComparatorDecadev compDev : comparatorDevsList) {
                 System.out.println(compDev);
             }



        //Comparable Devs
        ComparableDecadev devC1 = new ComparableDecadev("Nancy",Stack.JAVA,55.0,40.7,60.0);
        ComparableDecadev devC2 = new ComparableDecadev("Ben",Stack.JAVA,75.0,60.7,80.0);
        ComparableDecadev devC3 = new ComparableDecadev("Dan",Stack.JAVA,75.0,20.7,40.0);

        //Array list
        List<ComparableDecadev> comperableCDevList = new ArrayList<>();
        comperableCDevList.add(devC2);
        comperableCDevList.add(devC1);
        comperableCDevList.add(devC3);

//        compCDevs.sort(Comparator.reverseOrder());
//        compCDevs.sort(Comparator.naturalOrder());


        //Base on average
        comperableCDevList.sort(Comparator.reverseOrder());
//        comperableCDevList.sort(Comparator.naturalOrder());
        System.out.println("Priority Queue=====================================");
        for (ComparableDecadev compDev : comperableCDevList) {
            System.out.println(compDev);
        }
            System.out.println("===============================================");


        //Linked List
        LinkedList<Decadev> listFIFO = new LinkedList<>();
        listFIFO.add(dev2);
        listFIFO.add(dev1);
        listFIFO.add(dev3);

//        System.out.println("LinkedList Queue=====================================");
//        for (Decadev Dev : listFIFO) {
//            System.out.println(Dev);
//        }

//        System.out.println("====================ONE RESULT AT A TIME===========================");
//        System.out.println(goodluck.generateDevResult(dev1));
//        System.out.println("\n ===================ALL RESULT AT ONCE FROM LINKED-LIST============================");
//        System.out.println(goodluck.generateDevsResults(listFIFO));
//        System.out.println("===============================================");
//

//        System.out.println("\n ===================ALL RESULT AT ONCE FROM COMPARATOR LIST============================");
//        //Using the ComparatorDecadev list
//        for (ComparatorDecadev compDev :  comparatorDevsList) {
//            System.out.println(goodluck.generateDevResult(compDev));
//            System.out.println("===============================================");
//        }


//        System.out.println("\n ===================ALL RESULT AT ONCE FROM COMPARABLE LIST============================");
//        //Using the ComparableDecadev list
//        for (ComparableDecadev compDev :  comperableCDevList) {
//            System.out.println(goodluck.generateDevResult(compDev));
//            System.out.println("===============================================");
//        }
    }
}
