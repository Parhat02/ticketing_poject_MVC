package org.cydeo.converter;

import org.cydeo.dto.ProjectDTO;
import org.cydeo.service.ProjectService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesBinding
public class ProjectDtoConverter implements Converter<String, ProjectDTO> {
    private final ProjectService projectService;
    public ProjectDtoConverter(ProjectService projectService) {
        this.projectService = projectService;
    }
    @Override
    public ProjectDTO convert(String source) {

        if (source==null || source.equals("")){
            return null;
        }

        return projectService.findById(source);
    }
}
