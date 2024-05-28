package org.learning;

public class Hotstar implements StreamingService{
    private final int unitHours = 5;
    private final int unitPrice = 1;
    @Override
    public String getName() {
        return "Hotstar";
    }

    @Override
    public int getUnitHours() {
        return unitHours;
    }

    @Override
    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public boolean validateHours(int hours) {
        return hours % unitHours == 0; //if not divisble then we throw error that viewing hour should be in multiples
    }
}
