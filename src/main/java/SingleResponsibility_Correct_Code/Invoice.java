package SingleResponsibility_Correct_Code;

import SingleResponsibility_Correct_Code.Marker;

public class Invoice {
    // invoice has a marker
    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }


    // responsibility 1: calculate total price

    public void totalPriceOfMarkers(){
        System.out.println("Calculating the price of markers");
        double totalPrice=marker.price*quantity;
        System.out.println("Total price of markers is :"+ totalPrice);
    }
}
