package com.example.transactionaljdbc.services;

import com.example.transactionaljdbc.entities.Booking;
import com.example.transactionaljdbc.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.events.EventException;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Transactional
    public List<Booking> book() {
        bookingRepository.deleteAll();
        List<Booking> list =bookingRepository.findAll();
        if (!list.isEmpty())
        {
            return list;
        }
        else throw new EventException((short) 404,"Bookings May be Deleted.\nList is Empty");
    }
}
