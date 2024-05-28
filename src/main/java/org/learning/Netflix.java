package org.learning;

public class Netflix implements StreamingService{
    private final int unitHours = 10;
    private final int unitPrice = 10;
    @Override
    public String getName() {
        return "Netflix";
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
