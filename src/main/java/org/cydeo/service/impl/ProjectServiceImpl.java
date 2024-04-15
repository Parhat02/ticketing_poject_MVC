package org.cydeo.service.impl;

import org.cydeo.dto.ProjectDTO;
import org.cydeo.enums.Status;
import org.cydeo.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO, String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO project) {

        if (project.getProjectStatus()==null){
            project.setProjectStatus(Status.OPEN);
        }

        return super.save(project.getProjectCode(), project);
    }

    @Override
    public ProjectDTO findById(String projectCode) {
        return super.findById(projectCode);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String projectCode) {
        super.deleteById(projectCode);
    }

    @Override
    public void update(ProjectDTO project) {
        super.update(project.getProjectCode(), project);
    }
}
