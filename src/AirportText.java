import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportText {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Scanner scanner = new Scanner(System.in);
        PlaneService service = new PlaneService();
           int number = scanner.nextInt();
           switch (number){
               case 1:
                   service.Task1(plane);
                   break;
               case 2:
                   service.Task2(plane);
                   break;
               case 3:
                   service.Task3(plane , plane1);
                   break;
               case 4:
                   service.Task4(plane , plane1);
                   break;
               case 5:
                   service.Task5(plane, plane1 , plane2);
               case 6:
                   service.
           }

    }
}
