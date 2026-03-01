package SingleResponsibility_Correct_Code;

public class Main {
    public static void main(String[] args) {
        Marker m1=new Marker("Marker1","RED",20,2026);
        Invoice invoiceCal=new Invoice(m1,30);
        invoiceCal.totalPriceOfMarkers();
        InvoiceDaoDb invoiceDaoDb =new InvoiceDaoDb(invoiceCal);
        invoiceDaoDb.save(invoiceCal);
        InvoicePrint invoicePrint=new InvoicePrint(invoiceCal);
        invoicePrint.printInvoice();


    }
}
