
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chỉ số của một phần tử bất kỳ");
        int x = input.nextInt();
        try{
            System.out.println("Phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

}
