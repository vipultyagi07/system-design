package com.vip.service;

import com.vip.entity.Vehicle;
import com.vip.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;
    public Vehicle findExistingVehicle(Vehicle vehicle) {
        Vehicle oldVehicle=vehicleRepository.findByVehicleNo(vehicle.getVehicleNo());
        return oldVehicle!=null? oldVehicle:vehicle;

    }

    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public Vehicle findExistingVehicle(String vehicleNumber) {
        Vehicle vehicle = vehicleRepository.findByVehicleNo(vehicleNumber);
        return vehicle;
    }
}
