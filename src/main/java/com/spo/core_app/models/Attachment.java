package com.spo.core_app.models;

import com.spo.core_app.ennums.AttachmentType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attachment")
public class Attachment extends GlobalRecord{
    private String attachmentId;
    private String attachmentUrl;
    @Enumerated
    private AttachmentType attachmentType;
    private String attachmentDescription;
    private String fileOriginalName;
    private String fileSystemName;
}
