package com.irctc.irctc.post;

import com.irctc.irctc.binder.PassengerDetails;
import com.irctc.irctc.binder.TicketDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BookTrainTicket {

//    @GetMapping(value = "/getTicket")
//    public ResponseEntity<PassengerDetails> getTicketDetails(){
//        String msg = "Welcome to TicketBooking";
//
//        PassengerDetails passengerDetails = new PassengerDetails();
//        passengerDetails.setAge(34);
//        passengerDetails.setTrainName("Purusottam");
//        passengerDetails.setUserCity("Blore");
//        passengerDetails.setUserName("Lakshmikanta");
//        passengerDetails.setUserPhone("77484873");
//
//        ResponseEntity<PassengerDetails> ticketResponseEntity = bookTicket(passengerDetails);
//
//
//        return new ResponseEntity<>(passengerDetails,HttpStatus.OK);
//
//    }

    @PostMapping(value = "/bookTicket", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<TicketDetails> bookTicket(@RequestBody PassengerDetails passengerDetails){
        System.out.println(passengerDetails);

        TicketDetails t = new TicketDetails();
        t.setAge(passengerDetails.getAge());
        t.setTrainName(passengerDetails.getTrainName());
        t.setUserName(passengerDetails.getUserName());
        t.setUserCity(passengerDetails.getUserCity());
        t.setUserPhone(passengerDetails.getUserPhone());
        t.setTicketNumber(new Random().nextInt(100));

        System.out.println("Ticket is booked Successfully!! ");
        System.out.println(t);

        return new ResponseEntity<>(t, HttpStatus.CREATED);
    }

}
