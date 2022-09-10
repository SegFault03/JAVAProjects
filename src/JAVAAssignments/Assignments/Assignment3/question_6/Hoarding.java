package JAVAAssignments.Assignments.Assignment3.question_6;

public class Hoarding extends Advertise{
    double hoarding_costs;
    Hoarding(double material_costs, double production_costs, double media_costs,int number_of_days)
    {
        super(material_costs,production_costs,media_costs);
        hoarding_costs=number_of_days*12.50;
    }

    Hoarding(double material_costs, double production_costs, double media_costs,int number_of_days,boolean prime)
    {
        super(material_costs,production_costs,media_costs);
        hoarding_costs=number_of_days*12.50;
        hoarding_costs+=(50*hoarding_costs)/100;
    }

    void printCosts()
    {
        System.out.println("Printing costs of Hoarding:");
        super.printCosts();
        System.out.println("Variable costs: "+hoarding_costs);
    }
}
