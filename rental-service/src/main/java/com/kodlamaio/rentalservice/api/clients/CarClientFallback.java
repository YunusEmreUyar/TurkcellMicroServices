package com.kodlamaio.rentalservice.api.clients;

import com.kodlamaio.commonpackage.utils.dto.ClientResponse;
import com.kodlamaio.commonpackage.utils.exceptions.BusinessException;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class CarClientFallback implements CarClient {


    @Override
    //@Retry(name = "check-is-car-available")
    public ClientResponse checkIfCarAvailable(UUID carId) {

        log.info("INVENTORY SERVICE IS DOWN!");
        throw new BusinessException("INVENTORY_SERVICE_IS_DOWN!");
    }

}
