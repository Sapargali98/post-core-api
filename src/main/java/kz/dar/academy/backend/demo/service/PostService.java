package kz.dar.academy.backend.demo.service;
import kz.dar.academy.backend.demo.model.PostModel;

import java.util.List;
public interface PostService {
    PostModel createPost(PostModel post);
    List<PostModel> getAllPosts();
    void createClient(PostModel post);
    PostModel getClientById(String post);
    PostModel getPostById(String post);
    PostModel getStatus(String post);
    void updatePost(PostModel post);
    void updateClient(PostModel client);
    void deleteClientById(String post);
    void deletePostById(String post);
}

