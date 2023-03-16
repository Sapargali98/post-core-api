package kz.dar.academy.backend.demo.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostEntity,Long> {
    PostEntity getPostEntityByPostId(String postId);
    List<PostEntity> getPostEntityBy();
    @Transactional
    void deletePostEntityByPostId(String postId);
}
