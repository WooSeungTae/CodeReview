package programers;
public class Fibonacci {
    public long fibonacci(int num) {
        long answer = 0;
        if(num<2) return answer=num;
   // for(int n =2;n<num;n++){

  //  }
          answer = fibonacci(num-1)+fibonacci(num-2);
        return answer;
    }

  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 6;
        System.out.println(c.fibonacci(testCase));
    }
}