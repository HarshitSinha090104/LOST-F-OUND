package com.example.Lost_Found.DTO;

import lombok.Data;

@Data
public class RequestDTO {
    private String title;
    private String description;
    private String location;
    private String type;      // LOST or FOUND
    private String imageUrl;
}
