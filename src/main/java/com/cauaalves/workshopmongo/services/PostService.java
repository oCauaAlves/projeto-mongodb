package com.cauaalves.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cauaalves.workshopmongo.domain.Post;
import com.cauaalves.workshopmongo.dto.CommentDTO;
import com.cauaalves.workshopmongo.repository.PostRepository;
import com.cauaalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() ->
                new ObjectNotFoundException("Post não encontrado"));
    }

    public Post insertComment(String postId, CommentDTO commentDTO) {
        Post post = findById(postId);
        post.getComments().add(commentDTO);
        return repo.save(post);
    }
}