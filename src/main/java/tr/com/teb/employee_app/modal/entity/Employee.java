package tr.com.teb.employee_app.modal.entity;

import lombok.Builder;

import javax.persistence.*;
import java.util.Date;

@Builder
@Entity
@Table(name = "EMPLOYEES")
public class Employee {

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
