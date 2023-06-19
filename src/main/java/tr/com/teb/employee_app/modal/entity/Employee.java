package tr.com.teb.employee_app.modal.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@SequenceGenerator(name = "EMPLOYEE_SEQUENCE", sequenceName = "EMPLOYEES_SEQ", initialValue = 1, allocationSize = 1)
@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQUENCE")
    @Id
    @Column(name = "EMPLOYEE_ID")
    private int employeeID;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "HIRE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;

    @Column(name = "SALARY")
    private double salary;
}
