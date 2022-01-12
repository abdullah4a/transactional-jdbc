package com.example.transactionaljdbc.entities;

import javax.persistence.*;

@Entity
@Table(name = "BOOKINGS")
public class Booking {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "firstName", nullable = false)
    private String firstName;

    public Booking(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Booking() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
