package ru.tproger.axondemo.interfaces.rest.dto;

import lombok.Data;

@Data
public class RegisterBookDto {
    private String title;
    private String description;
    private Integer amount;
}
