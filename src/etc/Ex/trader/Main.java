package etc.Ex.trader;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList()
                .forEach(System.out::println);

        System.out.println("\n==========================================");
        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .toList()
                .forEach(System.out::println);

        System.out.println("\n==========================================");
        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(t -> t.getTrader().getName()))
                .toList()
                .forEach(System.out::println);

        System.out.println("\n==========================================");
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차 정렬하여 반환
        transactions.stream()
                .sorted(Comparator.comparing(t -> t.getTrader().getName()))
                .toList()
                .forEach(System.out::println);

        System.out.println("\n==========================================");
        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(flag1);

        System.out.println("\n==========================================");
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int sum = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println(sum);

        System.out.println("\n==========================================");
        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        Transaction max = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .get();
        System.out.println(max.getValue());

        System.out.println("\n==========================================");
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        Transaction min = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .get();
        System.out.println(min);

        System.out.println("\n==========================================");
        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        transactions.stream()
                .filter(t -> t.getValue() >= 500)
                .toList()
                .forEach(System.out::println);

        System.out.println("\n==========================================");
        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        OptionalDouble avg = transactions.stream()
                .filter(t -> t.getValue() > min.getValue()) // -> 값이 없을 가능성이 있다!
                .mapToInt(Transaction::getValue)
                .average();
        System.out.println(avg);
        // int는 값이 없으면 0을 리턴하지만 double은 값이 없으면 오류가 나기 때문에 OptionalDouble로 받아줘야 함!

    }
}