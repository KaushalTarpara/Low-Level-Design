package CreationalDesignPattern.Builder.Builders;

import CreationalDesignPattern.Builder.Product.House;

public class TreeHouseBuilder implements  HouseBuilder{

    private House house;

    public TreeHouseBuilder(){
        this.house=new House();
    }

    public void buildBasement(){ house.setBasement("Wood Basement");}

    public void buildStructure(){ house.setStructure("Wood Blokes");}

    public void buildRoof(){ house.setRoof("Wood Roof");}

    public void buildInterior(){ house.setInterior("Wood Carvings");}

    public House getHouse(){
        return this.house;
    }

}
