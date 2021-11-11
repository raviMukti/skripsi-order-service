package spring.micro.oms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(length = 30, nullable = false)
    private String sku;

    @Column(length = 30, nullable = false)
    private String barcode;

    @Column(length = 255, nullable = false)
    private String productName;

    @Column(length = 100000)
    private String description;

    @Column(length = 255, nullable = true)
    private String brand;

    @Column(length = 255, nullable = true)
    private String material;

    @Column(length = 255, nullable = true)
    private String motif;

    @Column(length = 255, nullable = true)
    private String colour;

    @Column(nullable = false)
    private BigDecimal price;

    @Column
    private BigDecimal weight;

    @Column
    private BigDecimal lenght;

    @Column
    private BigDecimal width;

    @Column
    private BigDecimal height;

    @Column
    private Boolean hasVariant;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @Column
    private Long createdBy;

    @Column
    private Long updatedBy;

    @OneToMany(mappedBy = "product")
    private List<VariantEntity> variantList;

    @OneToMany(mappedBy = "product")
    private List<StockEntity> stockList;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryEntity category;

    @OneToOne(mappedBy = "product")
    private ProductResourceEntity productResource;

}
