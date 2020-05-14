package com.example.priorityQueue;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;


/*

Internally implemented using heap data structure.
A PriorityQueue is for retrieving
elements based on priority. Irrespective of the order in which you insert,
when you remove the elements, the highest priority element will be retrieved first.

A PriorityQueue is used when the objects are supposed to be processed based on the priority.
It is known that a queue follows First-In-First-Out algorithm

*/

public class MainEx {

    public static void main(String a[]){

        Comparator<Employee> nameSorter=Comparator.comparing(Employee::getName);

        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(nameSorter);
        //PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Employee(1l, "AAA", LocalDate.now()));
        priorityQueue.add(new Employee(4l, "CCC", LocalDate.now()));
        priorityQueue.add(new Employee(5l, "BBB", LocalDate.now()));
        priorityQueue.add(new Employee(2l, "FFF", LocalDate.now()));
        priorityQueue.add(new Employee(3l, "DDD", LocalDate.now()));
        priorityQueue.add(new Employee(6l, "EEE", LocalDate.now()));

        while(true)
        {
            Employee e = priorityQueue.poll();
            System.out.println(e);

            if(e == null)
                break;
        }
    }
}
