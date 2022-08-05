package Java01;
// 문제 : 아래와 같이 출력 되도록 해주세요.
public class Exam02{
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
        // 칼(으)로 공격합니다.

        a전사.창_모드로_변경();

        a전사.공격();
        // 창(으)로 공격합니다.

        a전사.지팡이_모드로_변경();

        a전사.공격();
        // 지팡이(으)로 공격합니다.


    }
}

class 전사 {
    String 무기;

    전사() {
        this.무기 = "칼";
    }

    void 공격() {
        if (무기 == "칼") {
            System.out.println(무기 + "(으)로 공격합니다.");
        } else if (무기 == "활") {
            System.out.println(무기 + "(으)로 공격합니다.");
        } else if (무기 == "지팡이") {
            System.out.println(무기 + "(으)로 공격합니다.");
        }
    }

    void 창_모드로_변경() {
        무기 = "창";
    }

    void 지팡이_모드로_변경() {
        무기 = "지팡이";
    }
}