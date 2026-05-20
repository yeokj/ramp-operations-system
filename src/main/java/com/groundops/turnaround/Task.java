package com.groundops.turnaround;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "tasks")
public class Task {
    @Id
    private String id; // MongoDB ObjectId

    @Field("task_id")
    private String taskId;

    @Field("flight_id")
    private String flightId;

    @Field("task_name")
    private String taskName;

    @Field("assigned_team")
    private String assignedTeam;

    private String status;
    private List<String> dependencies;

    @Field("start_time")
    private LocalDateTime startTime;

    @Field("end_time")
    private LocalDateTime endTime;

    public Task() {}

    public Task(String taskId, String flightId, String taskName, String assignedTeam, String status,
                List<String> dependencies, LocalDateTime startTime, LocalDateTime endTime) {
        this.taskId = taskId;
        this.flightId = flightId;
        this.taskName = taskName;
        this.assignedTeam = assignedTeam;
        this.status = status;
        this.dependencies = dependencies;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }
    public String getTaskId() {
        return taskId;
    }
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    public String getFlightId() {
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getAssignedTeam() {
        return assignedTeam;
    }
    public void setAssignedTeam(String assignedTeam) {
        this.assignedTeam = assignedTeam;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<String> getDependencies() {
        return dependencies;
    }
    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
