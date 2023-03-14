package kz.dar.academy.backend.demo.service;
import kz.dar.academy.backend.demo.model.PostModel;

import java.util.List;
public interface PostService {
    PostModel createPost(PostModel post);
    List<PostModel> getAllPosts();
    PostModel getClientById(String post);
    PostModel getPostById(String post);
    PostModel getStatus(String post);
    void updatePost(PostModel post);
    void deletePostById(String post);

}

