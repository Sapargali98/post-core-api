package kz.dar.academy.backend.demo.controller;

import jakarta.validation.Valid;
import kz.dar.academy.backend.demo.model.PostModel;
import kz.dar.academy.backend.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/{post}")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }
    @PostMapping("/all")
    public PostModel createPost(@RequestBody @Valid PostModel post) {
        return postService.createPost(post);
    }

    @PostMapping
    public void createClient(@RequestBody @Valid PostModel post){

        postService.createClient(post);
    }

    @GetMapping("/{getClientById}")
    public void getClientById(@RequestParam String clientId){
        postService.getClientById(clientId);
    }

    @GetMapping("/{postId}")
    public void getPostById(@RequestParam String postId){
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


    @PutMapping("/{clientId}")
    public void clientPost(@PathVariable String clientId, @RequestBody PostModel client){

        client.setClientId(String.valueOf(client));
        postService.updateClient(client);

    }

    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postById){
        postService.deletePostById(postById);
    }

    @DeleteMapping("/{clientId}")
    public void deleteClientById(@PathVariable String clientById){
        postService.deleteClientById(clientById);
    }
}

