package kz.dar.academy.backend.demo.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PostModel {
        @NotNull(message = "PostId can't be empty")
        private String postId;
        @NotNull(message = "ClientId can't be empty")
        private String clientId;
        private String postRecipientId;
        @NotNull(message = "PostItem can't be empty")
        private String postItem;
        private String status;
}
