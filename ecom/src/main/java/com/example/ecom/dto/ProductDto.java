package com.example.ecom.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductDto {

    private Long id;

    private String name;

    private Long price;

    private String description;

    private byte[] byteImg;

    private Long categoryId;

    private MultipartFile img;

    private Long quantity;

    private String categoryName;
}
