package org.example.First_page;


import org.example.First_page.Iface.Weightable;

public class PackedSet implements Weightable {
    private final Pack pack;
    private final Weightable[] weightables;
    private final String name;

    public PackedSet(Weightable[] weightables, Pack pack) {
        this.weightables = weightables;
        this.pack = pack;
        this.name = "default";
    }
    public PackedSet(Weightable[] weightables, Pack pack, String name) {
        this.weightables = weightables;
        this.pack = pack;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public Weightable[] getWeightables() {
        return weightables;
    }

    @Override
    public double getNetWeight() {
        double netWeight = 0;
        for (Weightable obj : weightables) {
            netWeight += obj.getGrossWeight();
        }
        return netWeight;
    }

    @Override
    public double getGrossWeight() {
        double grossWeight = pack.getWeight();
        for (Weightable obj : weightables) {
            grossWeight += obj.getGrossWeight();
        }
        return grossWeight;
    }
}
