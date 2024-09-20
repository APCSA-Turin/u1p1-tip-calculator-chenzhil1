package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double modifiedPercent = percent / 100.0;
        double tip = Math.round((cost * modifiedPercent) * 100) / 100.0; //I learned how to round from here https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java "(double)Math.round(value * 100000d) / 100000d"
        double totalBill = cost + tip;
        double costPerson = Math.round((cost / (double) people) * 100) / 100.0;
        double tipPerson = Math.round((tip / (double) people) * 100) / 100.0;
        double totalPerson = Math.round((cost * (1 + modifiedPercent) / (double) people) * 100) / 100.0; //This calculation required calculating from the start to get accurate result.
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" +  + tip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + costPerson + "\n");
        result.append("Tip per person: $" + tipPerson + "\n");
        result.append("Total cost per person: $" + totalPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;  
                 
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
