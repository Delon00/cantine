package ci.ada.cantine.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String creationDate;

    @OneToOne
    @JoinColumn(name = "plat_id")
    private Plat plat;
}

