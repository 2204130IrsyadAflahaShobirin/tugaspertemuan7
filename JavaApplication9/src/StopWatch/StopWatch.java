/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StopWatch;

/**
 *
 * @author User
 */
public class StopWatch {

       private long startTime;
       private long endTime;
       
       public StopWatch() {
           startTime = System.currentTimeMillis();
       }
       
       public void start() {
           startTime = System.currentTimeMillis();
       }
       
       public void stop() {
           endTime = System.currentTimeMillis();
       }
       
       public long getElapsedTime() {
           return endTime - startTime;
       }
}

