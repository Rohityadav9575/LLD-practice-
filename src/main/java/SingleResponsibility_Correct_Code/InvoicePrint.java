package SingleResponsibility_Correct_Code;

public class InvoicePrint {
    Invoice invoice;

    public InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("Printing the invoice");
    }
}
