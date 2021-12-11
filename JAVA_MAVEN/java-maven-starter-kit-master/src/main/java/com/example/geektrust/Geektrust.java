package com.example.geektrust;

import apartment.Apartment;
import apartment.ThreeBHK;
import apartment.TwoBHK;
import bill.Bill;
import guests.Guests;

import java.io.*;

public class Geektrust {
    public static void main(String[] args) throws IOException {

        int countArgs = args.length;
        int argsSize = 0;
        while (countArgs != 0) {
            praseGivenInputs(args[argsSize]);
            countArgs--;
            argsSize++;
        }
    }

    private static void praseGivenInputs(String args) throws IOException {
        String fileName = args;
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] forApartment = br.readLine().split(" ");
        int selectApartment = Integer.parseInt(forApartment[1]);
        String[] forWater = forApartment[2].split(":");
        int corporationWater = Integer.parseInt(forWater[0]);
        int borewellWater = Integer.parseInt(forWater[1]);
        int totalGuests = 0;


        while ((line = br.readLine()) != null) {
            while (!line.equals("BILL")) {
                String[] forAddGuests = line.split(" ");
                totalGuests += Integer.parseInt(forAddGuests[1]);
                line = br.readLine();
            }
        }


        print(selectApartment, corporationWater, borewellWater, totalGuests);
    }

    public static void print(int selectApartment, int corporationWater, int borewellWater, int totalGuests) {
        Apartment bhk = null;
        switch (selectApartment) {
            case 2:
                bhk = new TwoBHK(corporationWater, borewellWater);
                break;
            case 3:
                bhk = new ThreeBHK(corporationWater, borewellWater);
                break;
            default:
                System.out.println("wrong inputs");
                break;
        }

        Guests guest = new Guests(totalGuests);
        Bill bill = new Bill(bhk, guest);
        System.out.println(bill.totalLiters() + " " + bill.totalCost());
    }
}
