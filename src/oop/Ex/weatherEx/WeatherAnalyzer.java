package oop.Ex.weatherEx;

import static oop.Ex.weatherEx.WeatherConstants.*;

public class WeatherAnalyzer {
    /*
    2. 클래스 `WeatherAnalyzer` 생성
        - 메소드:
            - `checkTemperatureAlert(double temperature)`: 주어진 온도가 경보 기준을 초과하는지 확인합니다.
            - `checkPrecipitationAlert(double precipitation)`: 주어진 강수량이 경보 기준을 초과하는지 확인합니다.
     */

    public static boolean checkTemperatureAlert(double temperature) {
        if (MAX_TEMPERATURE_ALERT < temperature || temperature < MIN_TEMPERATURE_ALERT) {
            return true;
        }
        System.out.println("경보 기준을 초과하지 않는 온도입니다.");
        return false;
    }

    public static boolean checkPrecipitationAlert(double precipitation) {
        if (PRECIPITATION_ALERT < precipitation) {
            return true;
        }
        System.out.println("경보 기준을 초과하지 않는 강수량입니다.");
        return false;
    }
}
