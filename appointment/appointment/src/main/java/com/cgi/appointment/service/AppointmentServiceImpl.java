package com.cgi.appointment.service;

import com.cgi.appointment.model.Appointment;
import com.cgi.appointment.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService{

    private final AppointmentRepository appointmentRepository;

    @Override
    public Appointment bookAppointment(Appointment appointment) {
        appointment.setBookingstatus("Booked");
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public void cancelAppointment(int appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }
}
