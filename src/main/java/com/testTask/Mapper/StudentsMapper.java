package com.testTask.Mapper;

import com.testTask.DTO.StudentsDto;
import com.testTask.models.Students;
import com.testTask.services.GroupsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
@RequiredArgsConstructor
public class StudentsMapper {

    @Autowired
    private GroupsService groupsService;

    @Autowired
    private ModelMapper modelMapper;

    public Students toEntity (StudentsDto dto) {
        Students entity = new Students();
        entity.setGroup(groupsService.getEntity(dto.getGroup()));
        entity.setAcceptanceDate(dto.getAcceptanceDate());
        entity.setFullName(dto.getFullName());
        return entity;
    }

    public StudentsDto toDTO (Students entity) {
        StudentsDto dto = modelMapper.map(entity, StudentsDto.class);
        dto.setGroup(entity.getGroup().getId());
        dto.setFullName(entity.getFullName());
        dto.setAcceptanceDate(entity.getAcceptanceDate());
        return dto;
    }
}
