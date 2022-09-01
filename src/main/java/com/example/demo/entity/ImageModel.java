package com.example.demo.entity;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class ImageModel {
    private Long id;
    private String name;
    private byte[] imagesBytes;
    private Long userId;
    private Long postId;

    private LocalDateTime createDate;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }
}
