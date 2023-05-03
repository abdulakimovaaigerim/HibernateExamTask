package peaksoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "banks")
@Getter
@Setter
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(generator = "bank_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "bank_gen", sequenceName = "bank_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String address;
    @ManyToMany(mappedBy = "banks")
    private List<Client> clients;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Region region;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", clients=" + clients +
                ", region=" + region +
                '}';
    }
}
