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
    public void givenDistanceAndTime_Generate_total_fareOfJourney() {
        double distance = 5.0;
        int time = 20;
        double fare = invoice.calculateNormalFare(distance, time);
        System.out.println(fare);
        Assertions.assertEquals(70, fare, 0.0);
    }

    @Test
    public void givenSmalldistanceAndTime_shouldReturn_MinimumFare() {
        double distance = 0.2;
        int time = 2;
        double fare = invoice.calculateNormalFare(distance, time);
        System.out.println(fare);
        Assertions.assertEquals(5, fare, 0.0);
    }

    @Test
    public void given_multipleRide_shouldreturn_totalfare() {
        Ride[] rides = {new Ride(2.0, 5, "NORMAL"),
                new Ride(4.0, 5, "NORMAL"),
                new Ride(7.0, 3, "NORMAL")};
        double fare = invoice.calculateFare(rides);
        Assertions.assertEquals(143.0, fare);
    }
}
