package kz.dar.academy.backend.demo.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


@Table(name="post_table")
public class PostEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String postId;
    @Column(nullable = false,length = 50)
    private String clientId;
    @Column(nullable = false,length = 50)
    private String postRecipientId;
    @Column(nullable = false,length = 50)
    private String postItem;
    @Column(nullable = false,length = 50)
    private String status;
}
