package cl.acl.jdiazl.employee.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastname;

    @Column(unique = true)
    private String email;

    private String phone;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Address address;

    @Column(name = "job_id")
    private Long jobId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "boss_id", nullable = true)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Employee boss;

    private LocalDate birthdate;

    private LocalDate hiredate;

    private LocalDate firedate;

    @PrePersist
    public void prePersist() {
        this.hiredate = LocalDate.now();
    }
}

