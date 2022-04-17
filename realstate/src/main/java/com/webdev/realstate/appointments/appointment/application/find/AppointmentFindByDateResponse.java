package com.webdev.realstate.appointments.appointment.application.find;

import com.webdev.realstate.appointments.appointment.domain.Appointment;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentFindByDateResponse {

    private List<Appointment> appointments;

    public AppointmentFindByDateResponse(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<HashMap<String, Object>> response() {
        List<HashMap<String, Object>> response = appointments.stream().map(appointment-> appointment.data()).collect(Collectors.toList());
        return response;
    }

}
