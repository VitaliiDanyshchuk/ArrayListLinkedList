package com.company;
/**
 *
 *
 * Classname: Main
 * Date: 21.06.2020
 * @author: Vitalii Danyshchuk
 * @version: 1.1
 *
 * Task:
 * 1. Create ArrayList and LinkedList containing  100 000 Integer elements.
 * Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones.
 * Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 * Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 * Compare time intervals.
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ARRAY LIST
        System.out.println("ARRAY LIST ");
        List<Integer> arrayList = new ArrayList<>();
        LocalDateTime arlsStartTime = LocalDateTime.now(); //  time start create arrayList
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        LocalDateTime arlsFinishTime = LocalDateTime.now(); //  time finish create arrayList
        System.out.println("Creating Time arrayList is - " + ChronoUnit.
                MILLIS.between(arlsStartTime, arlsFinishTime) +" ms");

        // Insert on Arraylist
        LocalDateTime arlsInsertStartBegining = LocalDateTime.now(); // start time insert element on the begining
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i,i);
        }
        LocalDateTime arlsInsertFinishBegining = LocalDateTime.now(); // finish time insert element on the begining
        System.out.println("Time to insert on the begining  arrayList - "
                +ChronoUnit.MILLIS.between(arlsInsertStartBegining,
                arlsInsertFinishBegining) +" ms");

        LocalDateTime arlsInsertStartMiddle = LocalDateTime.now(); // start time insert element on the middle
        for (int i = 0; i < 1000; i++) {
            arrayList.add(49500+ i,i);
        }
        LocalDateTime arlsInsertFinishMiddle = LocalDateTime.now(); // finish time insert element on the middle
        System.out.println("Time to insert on the middle arrayList - "
                +ChronoUnit.MILLIS.between(arlsInsertStartMiddle,
                arlsInsertFinishMiddle) +" ms");

        LocalDateTime arlsInsertStartEnd = LocalDateTime.now(); // start time insert element on the end
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arlsInsertFinishEnd = LocalDateTime.now(); // finish time insert element on the end
        System.out.println("Time to insert on the end arrayList -  "
                +ChronoUnit.MILLIS.between(arlsInsertStartEnd,
                arlsInsertFinishEnd) +" ms");

       //update on ArrayList

        LocalDateTime arlsUpdateStartBegining = LocalDateTime.now(); // start time update element on the begining
        for (int i = 0; i < 1000; i++) {
            arrayList.set(i,4);
        }
        LocalDateTime arlsUpdateFinishBegining = LocalDateTime.now(); // finish time update element on the begining
        System.out.println("Time to update on the begining arrayList -  "
                +ChronoUnit.MILLIS.between(arlsUpdateStartBegining,
                arlsUpdateFinishBegining) +" ms");

        LocalDateTime arlsUpdateStartMiddle = LocalDateTime.now(); // start time update element on the middle
        for (int i = 0; i < 1000; i++) {
            arrayList.set(49500+ i,4);
        }
        LocalDateTime arlsUpdateFinishMiddle = LocalDateTime.now(); // finish time update element on the middle
        System.out.println("Time to update on the middle arrayList - "
                +ChronoUnit.MILLIS.between(arlsUpdateStartMiddle,
                arlsUpdateFinishMiddle) +" ms");

        LocalDateTime arlsUpdateStartEnd = LocalDateTime.now();  // start time update element on the end
        for (int i = 0; i < 1000; i++) {
            arrayList.set(99000,4);
        }
        LocalDateTime arlsUpdateFinishEnd = LocalDateTime.now();  // finish time update element on the end
        System.out.println("Time to update on the end arrayList - "
                +ChronoUnit.MILLIS.between(arlsUpdateStartEnd,
                arlsUpdateFinishEnd) +" ms");

        //delete on ArrayList

        LocalDateTime arlsDeleteStartBegining = LocalDateTime.now(); // start time delete element on the begining
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }
        LocalDateTime arlsDeleteFinishBegining = LocalDateTime.now(); // finish time delete element on the begining
        System.out.println("Time to delete on the begining arrayList -  "
                +ChronoUnit.MILLIS.between(arlsDeleteStartBegining,
                arlsDeleteFinishBegining) +" ms");

        LocalDateTime arlsDeleteStartMiddle = LocalDateTime.now(); // start time delete element on the middle
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(49500+ i);
        }
        LocalDateTime arlsDeleteFinishMiddle = LocalDateTime.now(); // start time delete element on the middle
        System.out.println("Time to delete on the middle arrayList - "
                +ChronoUnit.MILLIS.between(arlsDeleteStartMiddle,
                arlsDeleteFinishMiddle) +" ms");

        LocalDateTime arlsDeleteStartEnd = LocalDateTime.now(); // start time delete element on the end
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(99000);
        }
        LocalDateTime arlsDeleteFinishEnd = LocalDateTime.now(); // start time delete element on the end
        System.out.println("Time to delete on the end arrayList - "
                +ChronoUnit.MILLIS.between(arlsDeleteStartEnd,
                arlsDeleteFinishEnd) +" ms");


        // LINKED LIST
        System.out.println("LINKED LIST ");

        List<Integer> linkedList = new LinkedList<>();
        LocalDateTime lnklsStartTime = LocalDateTime.now(); //  time start create linkedList
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        LocalDateTime lnklsFinishTime = LocalDateTime.now(); //  time finish create linkedList
        System.out.println("Creating Time linkedList is - " + ChronoUnit.
                MILLIS.between(lnklsStartTime, lnklsFinishTime) +" ms");

        // Insert on linkedlist
        LocalDateTime lnklsInsertStartBegining = LocalDateTime.now(); // start time insert element on the begining
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i,i);
        }
        LocalDateTime lnklsInsertFinishBegining = LocalDateTime.now(); // finish time insert element on the begining
        System.out.println("Time to insert on the begining  lnkList - "
                +ChronoUnit.MILLIS.between(lnklsInsertStartBegining,
                lnklsInsertFinishBegining) +" ms");

        LocalDateTime lnklsInsertStartMiddle = LocalDateTime.now(); // start time insert element on the middle
        for (int i = 0; i < 1000; i++) {
            linkedList.add(49500+ i,i);
        }
        LocalDateTime lnklsInsertFinishMiddle = LocalDateTime.now(); // finish time insert element on the middle
        System.out.println("Time to insert on the middle linkedList - "
                +ChronoUnit.MILLIS.between(lnklsInsertStartMiddle,
                lnklsInsertFinishMiddle) +" ms");

        LocalDateTime lnklsInsertStartEnd = LocalDateTime.now(); // start time insert element on the end
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        LocalDateTime lnklsInsertFinishEnd = LocalDateTime.now(); // finish time insert element on the end
        System.out.println("Time to insert on the end linkedList -  "
                +ChronoUnit.MILLIS.between(lnklsInsertStartEnd,
                lnklsInsertFinishEnd) +" ms");

        //update on linkedList

        LocalDateTime lnklsUpdateStartBegining = LocalDateTime.now(); // start time update element on the begining
        for (int i = 0; i < 1000; i++) {
            linkedList.set(i,4);
        }
        LocalDateTime lnklsUpdateFinishBegining = LocalDateTime.now(); // finish time update element on the begining
        System.out.println("Time to update on the begining linkedList -  "
                +ChronoUnit.MILLIS.between(lnklsUpdateStartBegining,
                lnklsUpdateFinishBegining) +" ms");

        LocalDateTime lnklsUpdateStartMiddle = LocalDateTime.now(); // start time update element on the middle
        for (int i = 0; i < 1000; i++) {
            linkedList.set(49500+ i,4);
        }
        LocalDateTime lnklsUpdateFinishMiddle = LocalDateTime.now(); // finish time update element on the middle
        System.out.println("Time to update on the middle linkedList - "
                +ChronoUnit.MILLIS.between(lnklsUpdateStartMiddle,
                lnklsUpdateFinishMiddle) +" ms");

        LocalDateTime lnklsUpdateStartEnd = LocalDateTime.now();  // start time update element on the end
        for (int i = 0; i < 1000; i++) {
            linkedList.set(99000,4);
        }
        LocalDateTime lnklsUpdateFinishEnd = LocalDateTime.now();  // finish time update element on the end
        System.out.println("Time to update on the end linkedList - "
                +ChronoUnit.MILLIS.between(lnklsUpdateStartEnd,
                lnklsUpdateFinishEnd) +" ms");

        //delete on linkedList

        LocalDateTime lnklsDeleteStartBegining = LocalDateTime.now(); // start time delete element on the begining
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }
        LocalDateTime lnklsDeleteFinishBegining = LocalDateTime.now(); // finish time delete element on the begining
        System.out.println("Time to delete on the begining linkedList -  "
                +ChronoUnit.MILLIS.between(lnklsDeleteStartBegining,
                lnklsDeleteFinishBegining) +" ms");

        LocalDateTime lnklsDeleteStartMiddle = LocalDateTime.now(); // start time delete element on the middle
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(49500+ i);
        }
        LocalDateTime lnklsDeleteFinishMiddle = LocalDateTime.now(); // start time delete element on the middle
        System.out.println("Time to delete on the middle linkedList - "
                +ChronoUnit.MILLIS.between(lnklsDeleteStartMiddle,
                lnklsDeleteFinishMiddle) +" ms");

        LocalDateTime lnklsDeleteStartEnd = LocalDateTime.now(); // start time delete element on the end
        for (int i = 0; i < 1000; i++) {
           linkedList.remove(99000);
        }
        LocalDateTime lnklsDeleteFinishEnd = LocalDateTime.now(); // start time delete element on the end
        System.out.println("Time to delete on the end arrayList - "
                +ChronoUnit.MILLIS.between(lnklsDeleteStartEnd,
                lnklsDeleteFinishEnd) +" ms");

}}
