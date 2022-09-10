package JAVAAssignments.Assignments.Assignment3.question_6;

public class Advertise {
    double fixed_cost;
    Advertise(double material_costs, double production_costs, double media_costs)
    {
        fixed_cost = material_costs+production_costs+media_costs;
    }
    void printCosts()
    {
        System.out.println("Fixed costs: "+fixed_cost);
    }
}
