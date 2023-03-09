package org.example.domain;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "tanks_type")
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Tank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long vld;
    private Long nld;
    private Long side;
    private Double accuracy;
}
