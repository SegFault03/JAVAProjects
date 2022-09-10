package JAVAAssignments.Assignments.Assignment3.question_6;

public class Newspaper extends Advertise {
    double newspaper_costs;
    Newspaper(double material_costs, double production_costs, double media_costs,double number_of_columns)
    {
        super(material_costs,production_costs,media_costs);
        newspaper_costs=number_of_columns*2.50;
    }
    void printCosts()
    {
        System.out.println("Printing costs of Newspaper:");
        super.printCosts();
        System.out.println("Variable costs: "+newspaper_costs);
    }
}
