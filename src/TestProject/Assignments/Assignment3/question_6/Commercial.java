package TestProject.Assignments.Assignment3.question_6;

public class Commercial extends Advertise{
    double commercial_costs;
    Commercial(double material_costs, double production_costs, double media_costs,double air_time)
    {
        super(material_costs, production_costs, media_costs);
        commercial_costs=air_time*120.50;
    }
    Commercial(double material_costs, double production_costs, double media_costs,double air_time,boolean prime_time)
    {
        super(material_costs, production_costs, media_costs);
        commercial_costs=air_time*2*120.50;
    }

    @Override
    void printCosts() {
        System.out.println("Printing costs of TV Commercial:");
        super.printCosts();
        System.out.println("Variable costs: "+commercial_costs);
    }
}
