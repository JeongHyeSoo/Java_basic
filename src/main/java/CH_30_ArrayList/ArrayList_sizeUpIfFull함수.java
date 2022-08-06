package CH_30_ArrayList;

// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요. add 함수에서 배열의 크기가 자동으로 늘어나도록 해주세요.
public class ArrayList_sizeUpIfFull함수 {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300

        value = ar.get(3);
        System.out.println(value);
        // 출력 : 400
    }
}

private class ArrayList {
    int[] datas;
    int lastIndex = -1;

    ArrayList() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void sizeUpIfFull() {
        if (isFull()) {
            sizaUp();
        }
    }

    boolean isFull() {
        return lastIndex == datas.length - 1;
    }

    void sizeUp() {
        //1 : 2배 더 큰 배열 객체를 만든다.
        //2 : 이사한다.
        //3 : datas가 더 이상 기존 배열을 가리키지 않고 새로 만든 배열을 가리킨다.

        int[] newDatas = new int[datas.length * 2];

        for (int i = 0; i < datas.length; i++) {
            newDatas[i] = datas[i];
        }
        System.out.printf("사이즈 업 (%d => %d)\n", datas.length, newDatas.length);

        datas = newDatas;
        //기존 배열은 datas와의 연결이 끊기고 가비지컬랙팅 됨

    }

    void add(int data) {
        sizeUpIfFull();
        System.out.printf("데이터 %d 삽입됨\n", data);
        lastIndex++;
        datas[lastIndex] = data;
    }

    int get(int index) {
        return datas[index];
    }
}