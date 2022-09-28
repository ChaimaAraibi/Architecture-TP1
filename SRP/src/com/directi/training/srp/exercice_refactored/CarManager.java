package com.directi.training.srp.exercice_refactored;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private final CarDatabase _carDb;
    private final CarNames _carFormatter;
    private final BestCar _bestCar;

    public CarManager(CarDatabase carDao, CarNames carFormatter, BestCar bestCar)
    {
        _carDb = carDao;
        _carFormatter = carFormatter;
        _bestCar = bestCar;
    }

    public Car getCarById(final String carId)
    {
        return _carDb.getFromDb(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDb.getCarDb());
    }

    public Car getBestCar()
    {
        return _bestCar.getBestCar(_carDb.getCarDb());
    }
}
