package peaksoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(generator = "client_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "client_gen", sequenceName = "client_seq", allocationSize = 1)
    private Long id;
    private String fullName;
    private String phoneNumber;

    @OneToOne(mappedBy = "client", cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE})
    private Passport passport;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST})
    private List<Bank> banks;

    public Client(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", passport=" + passport +
                '}';
    }

    public void addBank(Bank bank) {
        this.banks.add(bank);
    }
}
