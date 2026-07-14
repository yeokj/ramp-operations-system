package com.groundops.turnaround;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "flights")
public class Flight {
    @Id
    @Field("flight_number")
    private String flightNumber;

    @Field("gate")
    private String gate;

    @Field("scheduled_arrival")
    private LocalDateTime scheduledArrival;

    @Field("scheduled_departure")
    private LocalDateTime scheduledDeparture;

    private FlightStatus status;

    public Flight() {}

    public Flight(String flightNumber, String gate, LocalDateTime scheduledArrival, LocalDateTime scheduledDeparture, FlightStatus status) {
        this.flightNumber = flightNumber;
        this.gate = gate;
        this.scheduledArrival = scheduledArrival;
        this.scheduledDeparture = scheduledDeparture;
        this.status = status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public LocalDateTime getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(LocalDateTime scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public LocalDateTime getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(LocalDateTime scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
