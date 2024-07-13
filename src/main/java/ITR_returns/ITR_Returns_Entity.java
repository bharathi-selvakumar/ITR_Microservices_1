package ITR_returns;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ITR_Returns_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int formId;
    private int itrNumber;
    private int year;
    private String formType;
    private int  income;
    private int expenses;
    private int taxPayable;
}
