package service;

import model.Plane;

public class PlaneService {
    Plane plane = new Plane();
    public  void  Task1(Plane plane){
        System.out.println("Model" + plane.getModel());
        System.out.println("Country" + plane.getCountry());
        System.out.println("Year" + plane.getYear());
        System.out.println("Hours" +plane.getHours());
        System.out.println("isMilitary" + plane.isMilitary());
        System.out.println("Weight" + plane.getWeight());
        System.out.println("Wingspan" + plane.getWingspan());
        System.out.println("TopSpeed" + plane.getTopSpeed());
        System.out.println("Seats" + plane.getSeats());
        System.out.println("Cost" + plane.getCost());

    }


    public void Task2(Plane p ){
        if (p.isMilitary() ){
            System.out.println(p.getCost());
            System.out.println(p.getTopSpeed());
        }
        else {
            System.out.println(p.getModel());
            System.out.println(p.getCountry());
        }
    }

    public Plane Task3(Plane p1, Plane p2){
        if (p1.getYear() >= p2.getYear()){
            return p1;
        }
        else {
            return p2;
        }
    }
    public String Task4 (Plane plane1 , Plane plane2) {
       if (plane2.getWingspan() >= plane1.getWingspan() ){
           return plane2.getModel();
       }
       else {
         return   plane1.getModel();
       }

    }

    public void Task5(Plane p1 , Plane p2 , Plane p3){
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p3.getSeats()){
            System.out.println(p1.getCountry());
        } else if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()) {
            System.out.println(p2.getCountry());

        }
        else {
            System.out.println(p3.getCountry());
        }
    }

    public  void Task6 (Plane [] planes){
        int count = 0;
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary() ){
                count++;
            }
            }
          Plane [] planes1 = new Plane[count];
        for (int i = 0 , j = 0; i < planes.length; i++, j++) {
            if (!planes[i].isMilitary()){
                j++;
        }
            System.out.println(j);
        }
    }
    public void Task7 (Plane [] planes){
        int count = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()){
                count++;
            }
        }
        Plane [] planes1 = new Plane[count];
        for (int i = 0 , j = 0 ; i < planes.length; i++ , j++) {
            if (planes[i].isMilitary() && planes[i].getHours() >100){
                j++;
        }
            System.out.println(j);
        }
    }


    public Plane Task8(Plane [] planes){
        Plane minPlane = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getWeight() <= minPlane.getWeight()){
                minPlane = planes[i];
            }
        }
       return minPlane;
    }

    public Plane Task9(Plane [] planes){
        int count = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()){
                count++;
            }
        }
        Plane [] planes1 = new Plane[count];
        Plane minCost = planes1[0];
        for (int i = 0 ; i < planes.length; i++ ) {
            if (planes[i].isMilitary() & minCost.getCost() < planes1[i].getCost() ){
                 minCost = planes1[i];
            }
        }
        return minCost;
    }

     public void Task10(Plane [] planes){
         for (int i = 0; i < planes.length; i++) {
             Plane minYear = planes[0];
             for (int j = 0; j < planes.length; j++) {
                 if (planes[j].getYear() > minYear.getYear()){
                    minYear = planes[j];
                    planes[j] = planes[j-1];
                    planes[j-1] = minYear;
                 }
                 }
             }
         for (int i = 0; i < planes.length; i++) {
             System.out.println(planes[i] );

         }
             }

         }


