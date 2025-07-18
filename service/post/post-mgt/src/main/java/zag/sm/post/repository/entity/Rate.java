package zag.sm.post.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_rate")
public class Rate {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id" ,updatable = false)
    private Post post;

    @Basic
    @Column(name = "created_on", insertable = false, updatable = false)
    private Date createdOn;

    @Basic
    @Column(name = "last_modified_on", insertable = false, nullable = true)
    private Date lastModifiedOn;

    @Basic
    @Column(name = "created_by_id",updatable = false)
    private Long createdById;

    @Basic
    @Column(name = "rate")
    private Integer postRate;

}
