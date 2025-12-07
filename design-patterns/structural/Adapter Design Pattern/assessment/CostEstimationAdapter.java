package com.upgrad.designpatterns.structural.adapter.assessment;

/**
 * Adapter that allows a client to use the {@link MakingArchitecturalPlan}
 * interface to both create an architectural plan (via {@link Architect})
 * and get a rough raw‑material cost estimate (via {@link RawMaterialEstimator}).
 *
 * This is the class the customer will interact with instead of directly
 * dealing with the estimator.
 */
public class CostEstimationAdapter implements MakingArchitecturalPlan {

    private final Architect architect;
    private final RawMaterialEstimator estimator;
    private final double defaultCostPerSqFt;

    public CostEstimationAdapter(Architect architect,
                                 RawMaterialEstimator estimator,
                                 double defaultCostPerSqFt) {
        this.architect = architect;
        this.estimator = estimator;
        this.defaultCostPerSqFt = defaultCostPerSqFt;
    }

    @Override
    public void makePlan(String buildingName, double areaInSqFt) {
        // Delegate plan creation to the existing Architect class
        architect.makePlan(buildingName, areaInSqFt);

        // Use the estimator to calculate an approximate cost
        double estimatedCost = estimator.estimateCost(areaInSqFt, defaultCostPerSqFt);

        System.out.println("--- COST ESTIMATION (via Adapter) ---");
        System.out.println("Estimated raw‑material cost : " + estimatedCost);
        System.out.println("(Using rate " + defaultCostPerSqFt + " per sq.ft.)");
    }
}


