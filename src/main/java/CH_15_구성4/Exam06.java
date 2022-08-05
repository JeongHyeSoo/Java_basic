package Java01;

// 문제 : 아래 코드가 올바르게 실행되도록 해주세요.

public class Exam06 {
    public static void main(String[] args) {
        int 결과 = 계산기.get_n부터_m까지의_수_중에서_3의배수의_합(30, 400);

        System.out.println(결과);
        // 출력 => ???
    }
}
class 계산기{
    //Static 변수는 메모리에 한번 할당되어 프로그램이 종료될 때 해제되는 변수로,
    //메모리에 한번 할당되므로 여러 객체가 해당 메모리를 공유하게 된다.

    //일반적으로 static 변수는 public 및 final과 함께 사용되어 public static final로 활용
    //변하지 않는 상수값으로 고정, 메모리 절약

    //static 변수에 접근하기 위한 메소드는 반드시 static 메소드
    static int get_n부터_m까지의_수_중에서_3의배수의_합(int n,int m){
        int sum=0;

        for(int i =n; i <= m; i++ ) {
            if ( i % 3 == 0 ) {
                sum += i;
            }
        }

        return sum;
    }
}