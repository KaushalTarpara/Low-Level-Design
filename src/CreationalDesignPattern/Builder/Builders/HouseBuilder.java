package CreationalDesignPattern.Builder.Builders;

import CreationalDesignPattern.Builder.Product.House;

public interface HouseBuilder {

    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();

}
