package oop.Ex.weatherEx;

import static oop.Ex.weatherEx.WeatherAnalyzer.*;

public class Main {
    /*
    문제: 기상 조건 분석 시스템

    배경
        - 기상 정보 시스템에서는 다양한 기상 조건(예: 최고 기온, 최저 기온, 강수량)을 관리하고
        - 이를 기반으로 날씨 예측을 합니다. 이 시스템은 기상 조건을 나타내는 상수들을 정의하고,
        - 이러한 데이터를 활용하여 특정 날씨 조건이 어떠한 기준에 해당하는지 분석합니다.

    요구사항
    1. 클래스 `WeatherConstants` 생성
        - 속성:
            - 최고 기온 경보 기준(`MAX_TEMPERATURE_ALERT`, `static final double`) - 값을 40.0 으로 저장
            - 최저 기온 경보 기준(`MIN_TEMPERATURE_ALERT`, `static final double`) - 값을 -10.0 으로 저장
            - 강수량 경보 기준(`PRECIPITATION_ALERT`, `static final double`) - 값을 50.0 으로 저장
        - 이 클래스는 상수만을 포함하며, 인스턴스화되지 않습니다. 즉, 객체 생성을 못하게 막아주세요.

    2. 클래스 `WeatherAnalyzer` 생성
            - 메소드:
                - `checkTemperatureAlert(double temperature)`: 주어진 온도가 경보 기준을 초과하는지 확인합니다.
                - `checkPrecipitationAlert(double precipitation)`: 주어진 강수량이 경보 기준을 초과하는지 확인합니다.

    구현할 사항
        - `WeatherConstants`에서 상수를 정의하고, 이를 `WeatherAnalyzer`에서 사용하여 날씨 조건을 분석합니다.
        - `Main` 클래스에서 `WeatherAnalyzer`를 사용하여 몇 가지 기상 데이터에 대한 경보를 체크하고 결과를 출력합니다.
     */

    public static void main(String[] args) {
        double currentTemperature = 42.5;  // 현재 기온
        double currentPrecipitation = 60.0; // 현재 강수량

        boolean temperatureAlert = checkTemperatureAlert(currentTemperature);
        boolean precipitationAlert = checkPrecipitationAlert(currentPrecipitation);

        System.out.println("Temperature Alert: " + temperatureAlert);  // 40도 이상이므로 true
        System.out.println("Precipitation Alert: " + precipitationAlert); // 50mm 이상이므로 true
    }
}
