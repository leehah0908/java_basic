package song;

public class Main {
    public static void main(String[] args) {
    /*
    문제: 음악 및 가수 관리 프로그램

    배경
        - 특정 가수 및 해당 가수가 가진 음악을 저장할 수 있는 프로그램을 작성합니다.
        - 사용자의 입력값을 기반으로 객체가 생성되며, save 및 load 기능을 적용하여 데이터가 유지될 수 있도록 합니다.
        - 저장된 데이터는 메뉴에 따라 조회 및 검색할 수 있게 합니다.
        - util 패키지에 있는 Utility 클래스를 먼저 선언하는 것을 추천 합니다. 전역적인 입력 및 출력을 담당합니다.
        - 그 후에 Artist 객체를 디자인 한 후, ArtistView 및 ArtistRepository를 완성해 보시기 바랍니다.

    요구사항
    1. 클래스 `Artist` 정의
        - 패키지 경로: src.song
        - 가수 한 명에 대한 정보를 담는 객체 입니다.
        - 추후 세이브 파일에 저장될 수 있으니 Serializable 인터페이스를 구현합니다.
        - 필드:
            - `String name`: 가수명
            - `Set<String> songList`: 노래 목록
        - 생성자: 모든 매개값을 전달받는 생성자가 1개 존재합니다.
        - 메소드:
            - getter, setter, toString이 존재합니다.

    2. 클래스 `ArtistView` 정의
        - 패키지 경로: src.song
        - 화면단을 담당하는 클래스로 사용합니다.
        - 대부분의 기능을 static으로 선언하여 해당 객체 생성 없이도 화면을 띄울 수 있게 설계합니다.
        - 큰 틀은 아래 예시 코드 스케치에 작성해 놓았습니다. 세부 내용을 구현해 보시기 바랍니다.

    3. 클래스 `ArtistRepository` 생성
        - 패키지 경로: src.song
        - 가수 객체 저장소 역할을 하는 클래스 입니다.
        - 가수 목록을 뜻하는 artistList는 Map으로 되어 있습니다. 가수 이름과 Artist 객체의 쌍으로 이루어 집니다.
        - artistList는 private 하기 때문에 메서드를 통해 다룰 수 있습니다.
        - 예시 코드 스케치에 틀을 잡아 놓았으니 구현해 주시면 되겠습니다.

    4. 클래스 `Utility` 생성
        - 패키지 경로: src.util
        - 다목적 역할을 하는 Utility 클래스 입니다.
        - 여러 클래스에서 발생하는 입력 및 출력 등을 전역적으로 처리하기 위해 생성하는 클래스 입니다.
        - 속성:
             - `public static final String FILE_PATH`: 세이브 파일이 저장될 파일 경로입니다.
             - `static Scanner sc`: 범용적으로 사용될 Scanner 입니다. 정적 초기화자에서 객체가 생성됩니다.
        - 메서드:
             - `public static void makeLine()`: 입력창의 구분을 위해 단순히 줄을 그어주는 메서드 입니다.
             - `public static String input(String message)`: 입력받기 전 전달된 메세지를 출력합니다. 그 후 입력값을 리턴합니다.
     */
        ArtistView.start();
    }
}
