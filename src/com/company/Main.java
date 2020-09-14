package com.company;

import com.company.rental.BrazilTaxService;
import com.company.rental.CarRental;
import com.company.rental.RentalService;
import com.company.rental.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        System.out.println("hi");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Enter rental data");
        System.out.println("Car Model: ");
        String carModel = sc.nextLine();
        System.out.println("data inicio");
        Date start = sdf.parse(sc.nextLine());
        System.out.println("data fim");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start,finish, new Vehicle(carModel));

        System.out.println("preço por hora");
        double pricePerHour = sc.nextDouble();
        System.out.println("preço por dia");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(
                pricePerDay,pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE");
        System.out.println("Basic payment :" + cr.getInvoice().getBasicPayment());
        System.out.println("Tax:" + cr.getInvoice().getTax());
        System.out.println("Basic Payment:" + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
