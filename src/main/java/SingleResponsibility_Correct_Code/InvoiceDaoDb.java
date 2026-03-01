package SingleResponsibility_Correct_Code;

public class InvoiceDaoDb implements InvoiceDao{
    Invoice invoice;

    public InvoiceDaoDb(Invoice invoice) {
        this.invoice = invoice;
    }

    public void save(Invoice invoice){
        System.out.println("Saving the invoice to DB");
    }
}
