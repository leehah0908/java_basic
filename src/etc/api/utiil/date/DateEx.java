package etc.api.utiil.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        // 자바 8 이전에 사용하던 방식
        Date date = new Date();
        System.out.println(date);

        System.out.println("================================");
        // 현재 날짜 정보 얻기 (년, 월, 일)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 현재 시간 정보 얻기 (시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 현재 날짜와 시간 정보 모두 얻기
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        // 연, 월, 일 따로 추출
        int year = nowDateTime.getYear();
        Month month = nowDateTime.getMonth(); // -> 문자 형태의 월 리턴 (MONTH는 열거형 타입 중 하나)
        int monthValue = nowDateTime.getMonthValue(); // -> 숫자 형태의 월 리턴
        int datOfMonth = nowDateTime.getDayOfMonth();
        DayOfWeek datOfWeek = nowDateTime.getDayOfWeek(); // -> 문자 형태의 요일 리턴

        System.out.println("년: " + year);
        System.out.println("String 형식의 월: " + month);
        System.out.println("int 형식의 월: " + monthValue);
        System.out.println("일: " + datOfMonth);
        System.out.println("요일: " + datOfWeek);

        System.out.println("================================");
        // 특정 날짜와 시간 정보 얻기
        LocalDateTime ofDateTime = LocalDateTime.of(1997, 9, 8, 9, 30);
        System.out.println(ofDateTime);
        System.out.println("년: " + ofDateTime.getYear());
        System.out.println("월: " + ofDateTime.getMonth());
        System.out.println("일: " + ofDateTime.getDayOfMonth());
        System.out.println("요일: " + ofDateTime.getDayOfWeek());

        System.out.println("================================");
        // 지금으로부터 3일 뒤
        LocalDateTime d2 = LocalDateTime.now().plusDays(3);
        System.out.println("d2: " + d2);

        // 지금으로부터 1년 2개월 7일 뒤
        LocalDateTime d3 = nowDateTime.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println("d3: " + d3);

        // 지금으로부터 9개월 23일 전
        LocalDateTime d4 = nowDateTime.minusMonths(9).minusDays(23);
        System.out.println("d4: " + d4);

        System.out.println("================================");
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate r = LocalDate.of(2022, 9, 14);

        // 2020.12.30과 2022.09.14 사이의 일 수
        long between = ChronoUnit.DAYS.between(b, r);
        System.out.println("between = " + between);

        System.out.println("================================");
        // 날짜 포맷 변경하기
        // DateTimeFormatter 객체 생성 -> 원하는 날짜 형태를 서식 문자로 표현
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
        String formatDate = nowDateTime.format(dtf);
        System.out.println(formatDate);
    }
}
