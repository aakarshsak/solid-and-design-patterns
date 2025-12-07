package com.upgrad.designpatterns.structural.adapter.assessment;

/**
 * Target interface expected by the client.
 * An Architect (or an Adapter) will implement this to provide
 * plan creation (and, via an Adapter, cost estimation).
 */
public interface MakingArchitecturalPlan {

    /**
     * Create an architectural plan for a building and, if available,
     * provide a rough estimate of raw‑material cost.
     *
     * @param buildingName a short name/label for the building
     * @param areaInSqFt   built‑up area in square feet
     */
    void makePlan(String buildingName, double areaInSqFt);
}


