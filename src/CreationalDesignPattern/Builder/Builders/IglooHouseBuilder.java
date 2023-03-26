package CreationalDesignPattern.Builder.Builders;

import CreationalDesignPattern.Builder.Product.House;

public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder(){
        this.house=new House();
    }

    public void buildBasement(){ house.setBasement("Ice Basement");}

    public void buildStructure(){ house.setStructure("Ice Blokes");}

    public void buildRoof(){ house.setRoof("Ice Roof");}

    public void buildInterior(){ house.setInterior("Ice Carvings");}

    public House getHouse(){
        return this.house;
    }

}
