package org.cydeo.service;

import org.cydeo.dto.TaskDTO;
import org.cydeo.dto.UserDTO;
import org.cydeo.enums.Status;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO, Long>{

    List<TaskDTO> findTasksByManager(UserDTO manager);

    List<TaskDTO> findAllTasksByStatusIsNot(Status status);

    List<TaskDTO> findAllTasksByStatus(Status status);

    void updateStatus(TaskDTO task);
}
