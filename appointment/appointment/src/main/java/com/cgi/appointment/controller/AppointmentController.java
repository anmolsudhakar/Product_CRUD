package com.cgi.appointment.controller;
import com.cgi.appointment.model.Appointment;
import com.cgi.appointment.service.AppointmentService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;

    @PostMapping
    public ResponseEntity<Appointment> bookAppointment(@RequestBody Appointment appointment) {
        Appointment bookedAppointment = appointmentService.bookAppointment(appointment);
        return  ResponseEntity.status(HttpStatus.CREATED).body(bookedAppointment);
    }

    @GetMapping
    public  ResponseEntity<List<Appointment>> getAllAppointments() {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        return ResponseEntity.ok(appointments);
    }

    @DeleteMapping("/{appointmentId}")
    public ResponseEntity<Void> cancelAppointment(@PathVariable int appointmentId) {
        appointmentService.cancelAppointment(appointmentId);
        return ResponseEntity.ok().build();
    }

}
