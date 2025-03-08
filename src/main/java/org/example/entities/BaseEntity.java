package org.example.entities;

import org.example.enums.GeneralStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseEntity {
    private UUID uudID = UUID.randomUUID();
    private Boolean visible = true;
    private String createdDateTime = LocalDateTime.now().toString();
    private GeneralStatus status = GeneralStatus.ACTIVE;
}
