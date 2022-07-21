package com.autograph.comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="comment")

public class Comment {
    @Id
    private String commentId;
    private String photoId;
    private String message;
    private String createdBy;
    private String dateCreated;

}
