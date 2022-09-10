package JAVAAssignments.Assignments.Assignment2.Q4;

public class Invoice {
    String part_number,part_description;
    int qty_items;
    double item_price;
    Invoice(String pn,String pd,int qi,double ip)
    {
        part_description=pd;
        part_number=pn;
        qty_items= Math.max(qi, 0);
        item_price=ip>=0?ip:0;
    }
    double getInvoiceAmount()
    {
        return qty_items*item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price>=0?item_price:0;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public void setQty_items(int qty_items) {
        this.qty_items = Math.max(qty_items, 0);
    }

    public double getItem_price() {
        return item_price;
    }

    public int getQty_items() {
        return qty_items;
    }

    public String getPart_description() {
        return part_description;
    }

    public String getPart_number() {
        return part_number;
    }
}
