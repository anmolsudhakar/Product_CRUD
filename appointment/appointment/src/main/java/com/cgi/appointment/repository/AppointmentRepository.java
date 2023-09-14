package com.cgi.appointment.repository;

import com.cgi.appointment.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, Integer> {
}
