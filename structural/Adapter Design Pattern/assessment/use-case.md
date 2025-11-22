### Coding Assessment – Adapter Pattern Use Case

Consider a scenario where you have an **Architect** who can create architectural plans of buildings but **cannot calculate a rough estimation** of how much of the raw materials can be consumed in the construction.

Now, suppose a **customer wants to save money** and does not want to hire an engineer to estimate the amount of raw materials and the cost. The customer requests the architect to **create an architectural plan and estimate the cost of the raw materials as well**.  
You must **create an Adapter** so that the architect can estimate the total cost of raw materials using their plan‑building skills.

The solution for this can be built through the following steps:

1. **Create a `MakingArchitecturalPlan` interface** for declaring the `makePlan` function.  
2. **Create a function/class to calculate** the estimate of the raw materials.  
3. **Create the `Architect` class** which will implement and define the `MakingArchitecturalPlan` interface.  
4. **Create the Cost Estimation Adapter** which will call the class that estimates the cost of the raw materials.  
5. **Write the client code** that will just call the Adapter class and the `makePlan` function.


