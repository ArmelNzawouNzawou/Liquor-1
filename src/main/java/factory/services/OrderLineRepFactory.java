package factory.services;

import repository.orderLine.impl.OrderLineRep;

public class OrderLineRepFactory {
    public static OrderLineRep getOrderLine(){
        return OrderLineRep.getOrderLineRep();
    }
}
