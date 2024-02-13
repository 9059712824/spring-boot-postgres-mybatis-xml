package com.learning.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notes {

    private UUID uuid;

    private UUID userUuid;

    private String title;

    private String description;

    private Instant createdTime;

    private Instant updatedTime;
}
