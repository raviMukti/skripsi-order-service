package spring.micro.oms.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "stock")
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;

    @Column(nullable = false)
    private Long readyOrderQuantity;

    @Column(nullable = false)
    private Long reservedOrderQuantity;

    @Column(nullable = false)
    private Long damagedQuantity;
    
    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @Column
    private Long createdBy;

    @Column
    private Long updatedBy;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = true)
    private ProductEntity product;
    
    @ManyToOne
    @JoinColumn(name = "variant_id", nullable = true)
    private VariantEntity variant;

}
