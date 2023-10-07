/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Exam_3 {

    private void deletion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private class priorityqueuearray{
    int data;
    priorityqueuearray next;
    int priority;

    
   
    private priorityqueuearray (int data, int priority) {
        
    this.data = data;
    this.priority = priority;
    this.next = null;
   }
     }
    
     private priorityqueuearray front;
     private int printcount;
     
     public Exam_3(){
         
    front = null;
    printcount = 0;
}
     
    private void insertion (int item, int priority) throws Exception {
        priorityqueuearray node = new priorityqueuearray (item, priority);
        
       
        
        if (front==null|| priority <= front.priority) {
           node.next= front;
           front = node;
           
        } else {
         priorityqueuearray temp = front;
         while (temp.next!= null && temp.next.priority <= priority) {
            temp = temp.next;
            
         }
         node.next= temp.next;
         temp.next= node;
         
         
        }
        if (printcount >4) {
            delition ();
        }
        printcount++;
    }
    
    public int delition () throws Exception {
        if (front == null) {
            throw new Exception("Queue is empty");
            
        }
        int temp = front.data;
        front = front.next;
        printcount--;
        return temp;
        
        
    }
    
    public void display ()throws Exception {
        if (front == null) {
            throw new Exception("Queue is empty");
            
        }
        priorityqueuearray temp = front;
        System.out.println("priority value");
        
        while (temp!= null) {            
            System.out.println("print count: "+temp.data +" priority :"+temp.priority);
            temp = temp.next;
            
        }
    }

    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        Exam_3 list = new Exam_3();
    
        
        while (true) {
            System.out.println("Printing Priority");
            System.out.println("1. insert number and pages");
            System.out.println("2. display all added pages");
            System.out.println("3. Exit");
            
            if (scn.hasNextInt()){
                int input = scn.nextInt();
                switch (input){
                    
                    case 1:
                        System.out.println("insert number of pages");
                       int insert1 = scn.nextInt();
                        System.out.println("enter priority number");
                        int prio = scn.nextInt();
                        list.insertion(insert1, prio);
                        break;
                        
                    case 2:
                        System.out.println("display");
                        list.display();
                        break;
                        
                    case 3:
                          System.out.println("Exiting");
                        scn.close();
                        System.exit(0);
                        break;
                   
                    default:
                       throw new AssertionError();
                        
                }
            }
        }
    } 
    
}
