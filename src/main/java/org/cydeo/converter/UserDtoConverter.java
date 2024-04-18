package org.cydeo.converter;

import org.cydeo.dto.UserDTO;
import org.cydeo.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter implements Converter<String, UserDTO> {

    private final UserService userService;

    public UserDtoConverter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO convert(String source) {

        if (source==null || source.equals("")){
            return null;
        }

        return userService.findById(source);
    }
}
