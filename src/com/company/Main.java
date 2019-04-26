package com.company;
import java.util.ArrayList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();



                //establishing food arrays
                ArrayList<String> rice = new ArrayList<>();
                ArrayList<String> meat = new ArrayList<>();
                ArrayList<String> beans = new ArrayList<>();
                ArrayList<String> salsa = new ArrayList<>();
                ArrayList<String> veggies = new ArrayList<>();
//Establish array items to each list and list length

                rice.add("brown");
                rice.add("white");
                rice.add("no rice");


                meat.add("chicken");
                meat.add("steak");
                meat.add("carnidas");
                meat.add("chorizo");
                meat.add("sofritas");
                meat.add("veggies");

                beans.add("pinto");
                beans.add("black");
                beans.add("no beans");


                salsa.add("mild");
                salsa.add("medium");
                salsa.add("hot");
                salsa.add("no salsa");


                veggies.add("lettuce");
                veggies.add("fajita veggies");
                veggies.add("no veggies");



            int arroz = rnd.nextInt(rice.size());
            int carne = rnd.nextInt(meat.size());
            int beanz = rnd.nextInt(beans.size());
            int yalsa = rnd.nextInt(salsa.size());
            int greens = rnd.nextInt(veggies.size());



            for (int i = 1; i <=10; i++) {
                for (int k = 0; k <= 10; k++) {
                    arroz = rnd.nextInt(rice.size());
                    carne = rnd.nextInt(meat.size());
                    beanz = rnd.nextInt(beans.size());
                    yalsa = rnd.nextInt(salsa.size());
                    greens = rnd.nextInt(veggies.size());
                }



                System.out.println("Burrito" + ":" + rice.get(arroz) + "," + meat.get(carne) + "," + beans.get(beanz) + "," +  salsa.get(yalsa)+ "," + veggies.get(greens));



                }
            }
            }

