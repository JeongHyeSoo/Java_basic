package CH_30_ArrayList;

public class ArrayList_add함수 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }

    private class ArrayList {
        int[] datas;
        int lastIndex;

        ArrayList() {
            datas = new int[3];
            lastIndex = -1;
        }

        void add(int value) {
            lastIndex++;
            datas[lastIndex] = value;
        }

        int get(int index) {
            return datas[index];
        }
    }
}