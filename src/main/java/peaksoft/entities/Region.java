package peaksoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "regions")
@Getter
@Setter
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(generator = "region_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "region_gen", sequenceName = "region_seq", allocationSize = 1)
    private Long id;
    private String regionName;
    @OneToMany(mappedBy = "region", cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<Bank> banks;

    public Region(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                '}';
    }

}
