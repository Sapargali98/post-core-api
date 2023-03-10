package kz.dar.academy.backend.demo.service;

import kz.dar.academy.backend.demo.model.PostModel;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@Service

public class PostServiceImpl implements PostService{

    HashMap<String, PostModel> postMap = new HashMap<>();

    {
        PostModel post= new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(), "Post on the way", UUID.randomUUID().toString(), "Post complete");
        postMap.put(post.getPostId(),post);
    }
    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }
    @Override
    public PostModel createPost(PostModel post) {
        return postMap.put(post.getPostId(),post);
    }

    @Override
    public void createClient(PostModel post) {
        postMap.put(post.getClientId(), post);
    }
    @Override
    public PostModel getClientById(String postId) {
        return postMap.get(postId);
    }
    @Override
    public PostModel getPostById(String postClient) {
        return postMap.get(postClient);
    }
    @Override
    public PostModel getStatus(String postStatus) {
        return postMap.get(postStatus);
    }
    @Override
    public void updatePost(PostModel post) {
    }
    @Override
    public void updateClient(PostModel client) {
    }
    @Override
    public void deleteClientById(String clientId) {
        postMap.remove(clientId);
    }
    @Override
    public void deletePostById(String postId) {
        postMap.remove(postId);
    }
}
