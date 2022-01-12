package com.example.transactionaljdbc.repository;

import com.example.transactionaljdbc.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
