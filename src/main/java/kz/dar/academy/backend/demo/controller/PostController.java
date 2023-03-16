package kz.dar.academy.backend.demo.controller;

import kz.dar.academy.backend.demo.model.PostRequest;
import kz.dar.academy.backend.demo.model.PostResponse;
import kz.dar.academy.backend.demo.service.post.PostService;
import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }
    @PutMapping
    public PostResponse updatePost(@RequestParam String postId,@RequestBody PostRequest postRequest) {
        postRequest.setPostId(postId);
        return postService.updatePost(postRequest);
    }
    @GetMapping
    public PostResponse getPostById(@RequestParam String postId) {
        return postService.getPostById(postId);
    }
    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }
    @DeleteMapping
    public void deletePostById(@RequestParam String postId) {
       postService.deletePostById(postId);
    }

}
