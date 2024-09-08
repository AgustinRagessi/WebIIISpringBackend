package ar.edu.iw3.model;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    
    @Override
    public String toString() {
        return String.format("id=%s, name=%s", this.getId(), this.getName());
    }

}
