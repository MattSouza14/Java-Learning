package Exercicios.trycatch;

import entities.Resevation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio1 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

try{
    System.out.print("Room Number: ");
    int number = sc.nextInt();
    System.out.print("Check-in date (dd/MM/yyyy) ");
    Date checkin = sdf.parse(sc.next());
    System.out.print("Check-out date (dd/MM/yyyy) ");
    Date checkout = sdf.parse(sc.next());

    Resevation reservation = new Resevation(checkin, checkout, number);
    System.out.println("Resevation: " +  reservation);

    System.out.println();
    System.out.println("Atualize a data de reserva: ");
    System.out.println("Checkin date: ");
    checkin = sdf.parse(sc.next());
    System.out.println("Checkout date: ");
    checkout = sdf.parse(sc.next());

     reservation.uptadeDates(checkin, checkout);
     System.out.println("Resevation: " + reservation);

}catch (ParseException e){
    System.out.println("Data invalidada ");
}catch (DomainException e){
    System.out.println("Error na resevation: " + e.getMessage());
}catch (RuntimeException e){
    System.out.println("Erro inesperado ");
}



    }
}

