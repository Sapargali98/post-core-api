package kz.dar.academy.backend.demo.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PostModel {
        private String postId;
        @NotNull(message = "PostId can't be empty")
        private String clientId;
        @NotNull(message = "ClientId can't be empty")
        private String postRecipientId;
        private String postItem;
        @NotNull(message = "PostItem can't be empty")
        private String status;
}
