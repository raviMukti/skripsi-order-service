package spring.micro.oms.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_resource")
public class ProductResourceEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productResourceId;

    @Column
    private String urlPrimaryPhoto;

    @Column
    private String urlAlternativePhoto1;

    @Column
    private String urlAlternativePhoto2;

    @Column
    private String urlAlternativePhoto3;

    @Column
    private String urlAlternativePhoto4;
    
    @Column
    private String urlAlternativePhoto5;

    @Column
    private String urlAlternativePhoto6;

    @Column
    private String urlAlternativePhoto7;

    @Column
    private String urlVideo;

    @Column
    private String urlImageGuidance;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @Column
    private Long createdBy;

    @Column
    private Long updatedBy;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private ProductEntity product;
    
}
