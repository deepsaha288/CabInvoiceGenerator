package com.bridgelabs;

import com.bridgelab.CabInvoiceGenerator;
import com.bridgelab.InvoiceSummary;
import com.bridgelab.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTesting {

    CabInvoiceGenerator invoice = null;

    @BeforeEach
    public void initialize_object() {
        invoice = new CabInvoiceGenerator();
    }
 @Test
    public void givenSmalldistanceAndTime_shouldReturn_MinimumFare() {
        double distance = 0.2;
        int time = 2;
        double fare = invoice.calculateNormalFare(distance, time);
        System.out.println(fare);
        Assertions.assertEquals(5, fare, 0.0);

    }
}
