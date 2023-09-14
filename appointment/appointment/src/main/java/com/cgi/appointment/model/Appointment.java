package com.cgi.appointment.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "appointments")
public class Appointment {
    @Id
    private int appointmentId;
    private String doctorname;
    private String patientname;
    private String bookingdate;
    private String bookingstatus;

    public Appointment(String doctorname, String patientname, String bookingdate, String bookingstatus) {
        this.doctorname = doctorname;
        this.patientname = patientname;
        this.bookingdate = bookingdate;
        this.bookingstatus = bookingstatus;
    }
}
