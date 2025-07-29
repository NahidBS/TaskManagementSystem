package com.nahid.Task.Management.repository;

import com.nahid.Task.Management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
