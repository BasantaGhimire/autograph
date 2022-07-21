package com.autograph.album;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="album")
public class Album {
    @Id
    private String albumId;
    private String name;
    private String coverPicUrl;
    private String createdBy;
    private String dateCreated;
}
