package com.irctc.irctc.binder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDetails {
    private String userName;
    private String userPhone;
    private Integer age;
    private String userCity;
    private String trainName;
    private Integer ticketNumber;
}
