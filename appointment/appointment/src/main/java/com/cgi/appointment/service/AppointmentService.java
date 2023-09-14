package com.cgi.appointment.service;

import com.cgi.appointment.model.Appointment;

import java.util.List;

public interface AppointmentService  {
    Appointment bookAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    void cancelAppointment(int appointmentId);

}
