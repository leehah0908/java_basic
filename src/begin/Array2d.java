package begin;

public class Array2d {
    public static void main(String[] args) {
        int[][] score = {
            {79, 80, 99}, //A학생
            {95, 85, 89}, //B학생
            {90, 65, 56}, //C학생
            {69, 78, 77}  //D학생
            //과목: 3과목
        };

        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

//        학생 점수 출력
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                System.out.printf("%s의 %s점수는 %d점 입니다.\n", stuName[i], subName[j], score[i][j]);
//            }
//            System.out.println();
//        }

        System.out.println("===== 학생 평균 점수 출력 =====");
        int cnt = 0;
        for (int[] stu : score) {
            int sum = 0;
            for (int i : stu) {
                sum += i;
            }
            double avg = (double) sum / stu.length;
            System.out.printf("%s의 평균 : %.1f점\n", stuName[cnt], avg);
            cnt++;
        }

        System.out.println();
        System.out.println("===== 과목 평균 점수 출력 =====");
        for (int i = 0; i < score[i].length; i++) {
            int sum = 0;
            for (int j = 0; j < score.length; j++) {
                sum += score[j][i];
            }

            double avg = (double) sum / score.length;
            System.out.printf("%s의 평균 : %.1f점\n", subName[i], avg);
        }

        System.out.println();
        System.out.println("===== 반 평균 점수 출력 =====");
        int banAvgSum = 0;
        for (int[] stu : score) {
            int sum = 0;
            for (int i : stu) {
                sum += i;
            }
            double avg = (double) sum / stu.length;
            banAvgSum += avg;
        }
        double banAvg = (double) banAvgSum / score.length;
        System.out.printf("반 평균 : %.1f점\n", banAvg);

    }
}
