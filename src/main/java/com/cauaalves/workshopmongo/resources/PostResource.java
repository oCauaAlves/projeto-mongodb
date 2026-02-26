package com.cauaalves.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cauaalves.workshopmongo.domain.Post;
import com.cauaalves.workshopmongo.dto.CommentDTO;
import com.cauaalves.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping
    public ResponseEntity<List<Post>> findAll() {
        List<Post> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping("/{id}/comments")
    public ResponseEntity<Post> insertComment(
            @PathVariable String id,
            @RequestBody CommentDTO commentDTO) {

        Post post = service.insertComment(id, commentDTO);
        return ResponseEntity.ok().body(post);
    }
}