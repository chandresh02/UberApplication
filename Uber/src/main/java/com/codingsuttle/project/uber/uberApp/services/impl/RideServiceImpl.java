package com.codingsuttle.project.uber.uberApp.services.impl;

import com.codingsuttle.project.uber.uberApp.dto.DriverDto;
import com.codingsuttle.project.uber.uberApp.dto.RideDto;
import com.codingsuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingsuttle.project.uber.uberApp.dto.RiderDto;
import com.codingsuttle.project.uber.uberApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
