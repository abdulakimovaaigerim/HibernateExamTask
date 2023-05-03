package peaksoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "passports")
@Getter
@Setter
@NoArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(generator = "passport_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "passport_gen",sequenceName = "passport_seq", allocationSize = 1)
    private Long id;
    private String INN;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE})
    private Client client;

    public Passport(String INN) {
        this.INN = INN;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "INN='" + INN + '\'' +
                ", client=" + client +
                '}';
    }
}
