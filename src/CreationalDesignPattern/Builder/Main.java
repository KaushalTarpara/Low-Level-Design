package CreationalDesignPattern.Builder;

import CreationalDesignPattern.Builder.Builders.HouseBuilder;
import CreationalDesignPattern.Builder.Builders.IglooHouseBuilder;
import CreationalDesignPattern.Builder.Director.CivilEngineer;
import CreationalDesignPattern.Builder.Product.House;

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
