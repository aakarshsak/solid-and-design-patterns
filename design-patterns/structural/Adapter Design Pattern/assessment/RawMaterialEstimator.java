package com.upgrad.designpatterns.structural.adapter.assessment;

/**
 * Service that knows how to estimate raw‑material cost
 * based on area and a simple cost‑per‑sq.ft. heuristic.
 *
 * This class represents the "existing" functionality that
 * the Architect does not have direct access to.
 */
public class RawMaterialEstimator {

    /**
     * Very simple estimation logic for demonstration purposes.
     *
     * @param areaInSqFt    built‑up area
     * @param costPerSqFt   cost per square foot of raw materials
     * @return estimated total raw‑material cost
     */
    public double estimateCost(double areaInSqFt, double costPerSqFt) {
        if (areaInSqFt <= 0 || costPerSqFt <= 0) {
            throw new IllegalArgumentException("Area and cost per sq.ft. must be positive values");
        }
        return areaInSqFt * costPerSqFt;
    }
}


