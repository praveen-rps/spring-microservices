package com.cts.springtransactionsdemo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springtransactionsdemo.dto.FlightBookingAcknowledgement;
import com.cts.springtransactionsdemo.dto.FlightBookingRequest;
import com.cts.springtransactionsdemo.entity.PassengerInfo;
import com.cts.springtransactionsdemo.entity.PaymentInfo;
import com.cts.springtransactionsdemo.repository.PassengerInfoRepository;
import com.cts.springtransactionsdemo.repository.PaymentInfoRepository;
import com.cts.springtransactionsdemo.utils.PaymentUtils;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional//(readOnly = false,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getpId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);

    }
}
