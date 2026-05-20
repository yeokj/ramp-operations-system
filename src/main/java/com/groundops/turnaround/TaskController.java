package com.groundops.turnaround;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/{flightId}")
    public List<Task> getTasksByFlight(@PathVariable String flightId) {
        return taskRepository.findByFlightId(flightId);
    }
}
