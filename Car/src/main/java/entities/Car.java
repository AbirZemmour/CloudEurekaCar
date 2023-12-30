package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
     public Long id;
    public String marque;
    public String matricule;
    public String model;
    public Long id_client;
     //@Transient
 //@ManyToOne
 //privateClient client;
}
