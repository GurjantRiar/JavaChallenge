package com.company.factory;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    String flavor;
    Double salePrice;
    Double productionCost;
    Integer productionTime;
    ArrayList<String> ingredients;

    //no argument constructor
    public IceCream(){}

    //argument constructor
    public IceCream(String flavor, Double salePrice, Double productionCost, Integer productionTime, ArrayList<String> ingredients ){
        this.flavor=flavor;
        this.salePrice=salePrice;
        this.productionCost=productionCost;
        this.productionTime=productionTime;
        this.ingredients=ingredients;

    }

}
