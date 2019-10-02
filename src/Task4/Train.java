//Создайте  класс  Train, содержащий  поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем.
//Добавьте  возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами


package Task4;

import java.util.*;

public class Train {
    private String nameStation;
    private  int numberOfTrain;
    private double departureTime;

    private Train(String nameStation, int numberOfTrain, double departureTime) {
        this.nameStation = nameStation;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
    }

     public static void sortNumberOfTrain(Train[] list) {
         int []array = new int[list.length];
         for (int i = 0; i < list.length; i++) {
             Train d = list[i];
             array[i] = d.numberOfTrain;
         }
         for (int i = 0; i < list.length; i++) {
             Train d = list[i];
             Arrays.sort(array);
             d.numberOfTrain = array[i];
             if(d.numberOfTrain == 1){
                 d.nameStation = "Brest";
                 d.departureTime = 19.15;
             }
             if(d.numberOfTrain == 2){
                 d.nameStation = "Vitebsk";
                 d.departureTime = 21.15;
             }
             if(d.numberOfTrain == 3) {
                 d.nameStation = "Gomel";
                 d.departureTime = 23.23;
             }
             if(d.numberOfTrain == 4) {
                 d.nameStation = "Grodno";
                 d.departureTime = 22.06;
             }
             if(d.numberOfTrain == 6) {
                 d.nameStation = "Mogilev";
                 d.departureTime = 20.35;
             }
             if(d.numberOfTrain == 7) {
                 d.nameStation = "Minsk";
                 d.departureTime = 22.12;
             }
                 System.out.println(d.nameStation + " - " + d.numberOfTrain + " - " + d.departureTime);
         }
     }

    private static void findInformationAboutTrain(Train[] list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of train: ");
        int finder = scanner.nextInt();
        for (Train information : list) {
            if(finder==information.numberOfTrain) {
                System.out.println("Train №"+information.numberOfTrain+": "+information.nameStation + " - " + information.departureTime);
            }
        }
    }

    private static void sortNameStation(Train[] list) {
        String[]names = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            Train n = list[i];
            names[i] = n.nameStation;
        }
        for (int i = 0; i < list.length; i++) {
            Train n = list[i];
            Arrays.sort(names);
            n.nameStation = names[i];
            if(n.nameStation == "Brest"){
                n.departureTime = 19.15;
            }
            if(n.nameStation == "Vitebsk"){
                n.departureTime = 21.15;
            }
            if(n.nameStation == "Gomel") {
                n.departureTime = 23.23;
            }
            if(n.nameStation == "Grodno") {
                n.departureTime = 22.06;
            }
            if(n.nameStation == "Mogilev") {
                n.departureTime = 20.35;
            }
            if(n.nameStation == "Minsk") {
                n.departureTime = 22.12;
            }
            System.out.println(n.nameStation + " - " + n.departureTime);
        }

    }

    public static void main(String[] args) {

        Train[] list = {
                new Train("Minsk", 7, 22.12),
                new Train("Gomel", 3, 23.23),
                new Train("Brest", 1, 19.15),
                new Train("Mogilev", 6, 20.35),
                new Train("Vitebsk", 2, 21.15),
                new Train("Grodno", 4, 22.06)};

        findInformationAboutTrain(list);

        System.out.println();

        sortNumberOfTrain(list);

        System.out.println();

        sortNameStation(list);

    }
}

