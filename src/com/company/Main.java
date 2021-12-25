package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int zpMasha = 67760;
        int povishenieMasha = (int) (zpMasha * 0.1);
        int zpMashaNew = zpMasha + povishenieMasha;
        int month = 12;
        int differenceZpMasha = zpMashaNew * month - zpMasha * month;
        int zpDenis = 83690;
        int povishenieDenis = (int) (zpDenis * 0.1);
        int zpDenisNew = zpDenis + povishenieDenis;
        int differenceZpDenis = zpDenisNew * month - zpDenis * month;
        int zpKristina = 76230;
        int povishenieKristina = (int) (zpKristina * 0.1);
        int zpKristinaNew = zpKristina + povishenieKristina;
        int differenceZpKristina = zpKristinaNew * month - zpKristina * month;
        System.out.println("Маша теперь получает " + zpMashaNew + " рублей. Годовой доход вырос на " + differenceZpMasha + " рублей");
        System.out.println("Денис теперь получает " + zpDenisNew + " рублей. Годовой доход вырос на " + differenceZpDenis + " рублей");
        System.out.println("Кристина теперь получает " + zpKristinaNew + " рублей. Годовой доход вырос на " + differenceZpKristina + " рублей");



    }
}
