package org.cydeo.service;

import org.cydeo.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO, String>{

    void complete(ProjectDTO project);
}
