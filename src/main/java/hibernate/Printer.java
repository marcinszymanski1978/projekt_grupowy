package hibernate;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Printer")
@ToString
@RequiredArgsConstructor
public class Printer implements HibernateEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Setter @Getter
    private int id;

    @Column(name = "model")
    @Getter @Setter
    @NonNull
    private String model;

    @Column(name = "cmyk")
    @Getter @Setter
    @NonNull
    @ToString.Exclude
    private String cmyk;

    @Column(name = "localization")
    @Getter @Setter
    @NonNull
    private String localization;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLOYEE_ID", nullable = false, referencedColumnName = "ID")
    @NonNull
    public Employees employees;


    public Printer (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String isCmyk() {
        return cmyk;
    }

    public void setCmyk(String cmyk) {
        this.cmyk = cmyk;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
}
