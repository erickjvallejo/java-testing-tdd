package com.demotdd;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void getCar_returnsCarDetails() throws Exception {

        this.carRepository.save(new Car(null, "prius", "hybrid"));

        List<Car> cars = carRepository.findByName("prius");

        assertThat(cars.get(0).getName()).isEqualTo("prius");
    }

    @Test
    public void getCar_returnsOtherCar() throws Exception {

        Car carSaved = entityManager.persistFlushFind(new Car(null , "prius", "hybrid"));
        List<Car> carToFind = carRepository.findByName("prius");

        assertThat(carToFind.get(0).getName()).isEqualTo(carSaved.getName());
        assertThat(carToFind.get(0).getType()).isEqualTo(carSaved.getType());
    }
}