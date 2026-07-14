package com.groundops.turnaround;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "supervisor_reviews")
public class SupervisorReview {
    @Id
    private String id;

    @Field("flight_number")
    private String flightNumber;

    @Field("total_delay_minutes")
    private int totalDelayMinutes;

    private List<String> loggedDelays;

    @Field("timestamp")
    private LocalDateTime timestamp;

    SupervisorReview() {}

    public SupervisorReview(String flightNumber, int totalDelayMinutes, List<String> loggedDelays, LocalDateTime timestamp) {
        this.flightNumber = flightNumber;
        this.totalDelayMinutes = totalDelayMinutes;
        this.loggedDelays = loggedDelays;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getTotalDelayMinutes() {
        return totalDelayMinutes;
    }

    public void setTotalDelayMinutes(int totalDelayMinutes) {
        this.totalDelayMinutes = totalDelayMinutes;
    }

    public List<String> getLoggedDelays() {
        return loggedDelays;
    }

    public void setLoggedDelays(List<String> loggedDelays) {
        this.loggedDelays = loggedDelays;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
