package hibernate;

import hibernate.HibernateEntity;
import lombok.*;
import hibernate.Employees;

import javax.persistence.*;

@Entity
@Table(name = "Phones")
@ToString
@RequiredArgsConstructor
public class Phones implements HibernateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "model")
    @NonNull
    private String model;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLOYEE_ID", nullable = false, referencedColumnName = "ID")
    @NonNull
    public Employees employees;

    public Phones() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
}

