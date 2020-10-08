package com.BuilderDemo.Builders;

import com.BuilderDemo.Cars.Type;
import com.BuilderDemo.Components.Engine;
import com.BuilderDemo.Components.GPSNavigator;
import com.BuilderDemo.Components.Transmission;
import com.BuilderDemo.Components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
