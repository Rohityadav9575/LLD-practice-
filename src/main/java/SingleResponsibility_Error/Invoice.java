package SingleResponsibility_Error;

public class Invoice {
    // invoice has a marker
    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // responsibility 1: calculate total price

    public void totalPriceOfMarkers(int quantity,Marker marker){
        System.out.println("Calculating the price of markers");
        double totalPrice=marker.price*quantity;
        System.out.println("Total price of markers is :"+ totalPrice);
    }

    // responsibility 2: saveToDB
    public void saveToDB(){
        // saveTODB
    }

    public void printInvoice(){
        // printing invoice;
    }
}
