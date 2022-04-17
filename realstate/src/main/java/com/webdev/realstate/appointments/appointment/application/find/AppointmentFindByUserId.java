package com.webdev.realstate.appointments.appointment.application.find;

import com.webdev.realstate.appointments.appointment.domain.Appointment;
import com.webdev.realstate.appointments.appointment.domain.ports.AppointmentRepository;
import com.webdev.realstate.users.user.domain.valueobjects.UserId;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppointmentFindByUserId {
    private AppointmentRepository repository;

    public AppointmentFindByUserId(AppointmentRepository repository) {
        this.repository = repository;
    }

    public List<Appointment>  execute(String userId) {
        List<Appointment> appointments = new ArrayList<>();
        Optional<List<Appointment>> optionalAppointments = repository.findByUserId(new UserId(userId));
        if (optionalAppointments.isPresent()) {
            appointments = optionalAppointments.get();
        }
        return appointments;
    }
}
