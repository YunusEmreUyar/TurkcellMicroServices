package com.kodlamaio.commonpackage.events.inventory;

import com.kodlamaio.commonpackage.events.Event;
import com.kodlamaio.commonpackage.utils.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarStateChangedEvent implements Event {
    private UUID carId;
    private State state;
}
