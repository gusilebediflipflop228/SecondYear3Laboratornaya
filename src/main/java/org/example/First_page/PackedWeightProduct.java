package org.example.First_page;

import org.example.First_page.Iface.Weightable;

public class PackedWeightProduct extends WeightProduct implements Weightable{
    private final double weight;
    private final Pack pack;

    public PackedWeightProduct(WeightProduct weightGoods, double weight, Pack pack) {
        super(weightGoods.getName(), weightGoods.getDescription());
        this.weight = weight;
        this.pack = pack;
    }

    @Override
    public double getNetWeight(){
        return weight;
    }

    @Override
    public double getGrossWeight(){
        return weight + pack.getWeight();
    }

}
