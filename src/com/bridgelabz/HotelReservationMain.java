package com.bridgelabz;

public class HotelReservationMain
{
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotelDetails("Lakewood", 110, 90, 80, 80, 3);
        hotelReservation.addHotelDetails("Bridgewood", 160, 60, 110, 50, 4);
        hotelReservation.addHotelDetails("Ridgewood", 220, 150, 100, 40, 5);
        hotelReservation.viewHotels();
    }
}

