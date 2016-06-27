package com.demo;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.log4j.Logger;

import demo.order.Order;
import demo.order.OrderProcess;
import demo.order.OrderProcessImplService;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger           LOGGER      = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        OrderProcessImplService orderProcess = new OrderProcessImplService();
        OrderProcess port = orderProcess.getOrderProcessImplPort();

        Order order = new Order();
        order.setCustomerID("C001");
        order.setItemID("I001");
        order.setPrice(100.00);
        order.setQty(20);
//        String result = port.processOrder(order);
        LOGGER.debug("port: "+ port);
        LOGGER.debug("processOrder result: "+ port.processOrder(order));
    }
}
