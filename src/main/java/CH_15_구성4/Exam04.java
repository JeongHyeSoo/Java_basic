package Java01;

public class Exam04 {
// 문제 : 아래 코드가 실행되도록 해주세요.


    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
    }
}

class 병사{

    public static String 이름;
    int 계급번호=1;

    public void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 이름 + 계급명() +"입니다.");
    }

    public void 진급() {
        계급번호++;
    }

    String 계급명(){
        String 계급 ="";

        if (계급번호==1){
            계급="이병";
        }
        else if(계급번호==2){
            계급="일병";
        }
        else if(계급번호==3){
            계급="상병";
        }
        return 계급;
    }
}