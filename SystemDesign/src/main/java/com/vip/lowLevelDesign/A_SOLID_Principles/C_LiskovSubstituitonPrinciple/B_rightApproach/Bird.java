package com.vip.lowLevelDesign.A_SOLID_Principles.C_LiskovSubstituitonPrinciple.B_rightApproach;

     class Bird {
        void fly() {
            System.out.println("Flying...");
        }
    }

    class Penguin extends Bird{
         /* Penguin is a flightless bird, so either bird class shouldn't have a fly method or
            override it in the Penguin class with an appropriate implementation:
         */
        @Override
        void fly() {
            System.out.println("Penguin is a flightless bird, so it shouldn't have a fly method");
        }
     }

     class UsageClass{

         public static void main(String[] args) {
             Penguin penguin= new Penguin();
             penguin.fly();
             /**
              * In this example, Penguin is a subclass of Bird, but it inherits the fly method even though
              * Penguins are flightless birds. This violates the Liskov Substitution Principle because you
              * can't substitute a Penguin object for a Bird object without unexpected behavior
              */

         }

     }
