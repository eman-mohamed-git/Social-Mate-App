package zag.sm.post.repository.jpa;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import zag.sm.post.model.entity.CommentWithReaction;
import zag.sm.post.repository.entity.Comment;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentJPARepository extends JpaRepository<Comment, Long> {

    @Query("""
    SELECT new zag.sm.post.model.entity.CommentWithReaction(c,cr)
    FROM Comment c
    LEFT JOIN CommentReaction cr ON c.id=cr.comment.id AND cr.createdById=:currentUserId
    WHERE c.post.id=:postId
    ORDER BY c.createdOn DESC
    """)
    List<CommentWithReaction> findByPostId(@Param("postId") Long postId, @Param("currentUserId") Long currentUserId, Pageable pageable);

    @Query("SELECT COUNT(*) FROM Comment c WHERE c.post.id=:postId")
    Long getCommentsCount(@Param("postId") Long postId);

    Optional<Comment> findById(Long commentId);


}
