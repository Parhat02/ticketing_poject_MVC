package org.cydeo.service;

import org.cydeo.dto.TaskDTO;
import org.cydeo.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO, Long>{

    List<TaskDTO> findTasksByManager(UserDTO manager);
}
