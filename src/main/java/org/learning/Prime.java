package org.learning;

public class Prime implements StreamingService{
    private final int unitHours = 5;
    private final int unitPrice = 2;
    @Override
    public String getName() {
        return "Amazon Prime";
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
