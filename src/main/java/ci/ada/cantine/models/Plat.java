package ci.ada.cantine.models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data

public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String summary;
}
