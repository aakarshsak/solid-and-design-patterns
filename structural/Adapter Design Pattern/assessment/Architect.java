package com.upgrad.designpatterns.structural.adapter.assessment;

/**
 * Existing class that knows how to create architectural plans,
 * but does NOT know how to estimate raw‑material costs.
 */
public class Architect implements MakingArchitecturalPlan {

    @Override
    public void makePlan(String buildingName, double areaInSqFt) {
        System.out.println("=== ARCHITECTURAL PLAN ===");
        System.out.println("Building name   : " + buildingName);
        System.out.println("Built‑up area   : " + areaInSqFt + " sq.ft.");
        System.out.println("Floor layout    : 2BHK x 4 units per floor");
        System.out.println("Structure type  : RCC framed structure");
        System.out.println("Finishing level : Standard residential spec");
    }
}


