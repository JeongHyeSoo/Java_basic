package Java01;

public class Exam07 {
    public static void main(String[] args) {
        전사2 a전사 = new 홍길동();
        a전사.b무기 = new 활();

        a전사.공격();
        // 출력 => 홍길동이(가) 활(으)로 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

        a전사.b무기 = new 창();
        a전사.공격();
        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
    }
}

abstract class 전사2{
    String 이름;
    무기2 b무기;
    void 공격(){
        b무기.사용(이름);
    }
}

class 홍길동 extends 전사2{
    홍길동(){
        this.이름="홍길동";
    }
}
class 홍길순 extends 전사2{
    홍길순(){
        this.이름="홍길순";
        this.b무기 = new 칼();
    }
}


abstract class 무기2 {
    String 무기명;

    void 사용(String 이름){
        System.out.println(이름+"(이)가 "+무기명+"(으)로 공격합니다.");
    }
}
class 활 extends 무기2 {
    활() {
        무기명 = "활";
    }
}

class 칼 extends 무기2{
    칼(){
        무기명 = "칼";
    }
}

class 창 extends 무기2{
    창(){
        무기명 = "창";
    }
}
