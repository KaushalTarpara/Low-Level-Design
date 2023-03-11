package DesignPattern.Builder;

import DesignPattern.Builder.Builders.HouseBuilder;
import DesignPattern.Builder.Builders.IglooHouseBuilder;
import DesignPattern.Builder.Director.CivilEngineer;
import DesignPattern.Builder.Product.House;

public class Main {

    public static void main(String[] args) {

        //we went to build HouseType :Igloo
        HouseBuilder iglooBuilder = new IglooHouseBuilder();

        //tell that to our Director e.g.CivilEngineer
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        //engineer starts constructing house
        engineer.constructHouse();

        //house creation done,just fetch the house
        House house = engineer.getHouse();

        //Print the House
        System.out.println("Builder Constructed: " + house);

    }
}
