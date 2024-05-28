package org.learning;

public interface StreamingService {
    String getName();
    int getUnitHours();
    int getUnitPrice();
    boolean validateHours(int hours);

}
