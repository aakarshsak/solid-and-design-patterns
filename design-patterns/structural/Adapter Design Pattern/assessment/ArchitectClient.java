package com.upgrad.designpatterns.structural.adapter.assessment;

/**
 * Client code for the assessment use‑case.
 *
 * The customer talks only to the Adapter via the
 * {@link MakingArchitecturalPlan} interface. The Adapter
 * internally coordinates between the Architect and the
 * RawMaterialEstimator.
 */
public class ArchitectClient {

    public static void main(String[] args) {
        // Step 1 & 3: Architect that knows how to create plans
        Architect architect = new Architect();

        // Step 2: Service that knows how to estimate raw‑material cost
        RawMaterialEstimator estimator = new RawMaterialEstimator();

        // Step 4: Adapter that combines both capabilities
        MakingArchitecturalPlan planningWithCost =
                new CostEstimationAdapter(architect, estimator, 1200.0);

        // Step 5: Client just calls the Adapter through the interface
        planningWithCost.makePlan("Residential Apartment Building", 1500.0);
    }
}


