package org.learning;

import java.util.HashMap;
import java.util.Map;

public class CustomerPlan {
    private final Map<StreamingService,Integer> plan = new HashMap<>();
    public void addServiceHours(StreamingService service, int hours){
        if (service.validateHours(hours)) {
            plan.put(service, hours);
        } else {
            System.out.println(service.getName() + " allows viewing hours in multiples of " + service.getUnitHours() + " only.");
        }
    }
    public int calculateTotalCost() {
        int totalCost = 0;
        for (Map.Entry<StreamingService, Integer> entry : plan.entrySet()) {
            StreamingService service = entry.getKey();
            int hours = entry.getValue();
            totalCost += (hours / service.getUnitHours()) * service.getUnitPrice();
        }
        return totalCost;
    }
}
