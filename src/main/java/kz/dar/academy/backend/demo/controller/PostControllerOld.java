package kz.dar.academy.backend.demo.controller;

import jakarta.validation.Valid;
import kz.dar.academy.backend.demo.model.PostModel;
import kz.dar.academy.backend.demo.service.deprecated.PostServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("deprecated/post")
public class PostControllerOld {
    @Autowired
    private PostServiceOld postService;
    @GetMapping("check")
    public String check() {
        return "Post-core-api is working";
    }
    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }
    @PostMapping
    public PostModel createPost(@RequestBody @Valid PostModel post) {
        return postService.createPost(post);
    }

    @GetMapping("/{getClientById}")
    public void getClientById(@RequestParam String clientId){
        postService.getClientById(clientId);
    }

    @GetMapping("/{postId}")
    public void getPostById(@PathVariable String postId){
        postService.getPostById(postId);
    }

    @GetMapping
    public void getStatus(@RequestParam String status){
        postService.getStatus(status);
    }

    @PutMapping("/{postId}")
    public void updatePost(@PathVariable String postId, @RequestBody PostModel post){
        post.setPostId(postId);
        postService.updatePost(post);
    }

    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postById){
        postService.deletePostById(postById);
    }

}

