package SingleResponsibility_Correct_Code;

public class InvoiceFileDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        System.out.println("saving to File");
    }
}
