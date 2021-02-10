package view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.Car;
import racingCar.Cars;
import racingCar.Name;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OutputViewTest {

    @Test
    @DisplayName(" '-' 생성 확인 테스트")
    public void barTest() {
        String bars = OutputView.bar(3);

        assertThat(bars.length()).isEqualTo(3);
    }

    @Test
    @DisplayName("게임 승리자 반환 테스트")
    public void winnerTest() {

        List<Car> testCars = new ArrayList<>();
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");

        testCars.add(car1);
        testCars.add(car2);
        testCars.add(car3);

        Cars cars = new Cars(testCars);

        car1.move(4);
        car2.move(4);
        car3.move(0);

        cars.carAdd(car1);
        cars.carAdd(car2);
        cars.carAdd(car3);

        List<Name> winners = OutputView.getWinners(1, cars);

        assertThat(winners.size()).isEqualTo(2);
    }

}