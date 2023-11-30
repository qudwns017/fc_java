package chapter02.ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestaurantService {
    public static void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("주문 접수 번호를 입력해주세요. : ");
        int orderNum = Integer.parseInt(br.readLine());
        System.out.print("핸드폰 번호를 입력해주세요. : ");
        int phoneNum = Integer.parseInt(br.readLine());
        System.out.print("집주소를 입력해주세요. : ");
        String address = br.readLine();
        System.out.print("주문 날짜를 입력해주세요. : ");
        int orderDate = Integer.parseInt(br.readLine());
        System.out.print("주문 시간을 입력해주세요. : ");
        int orderTime = Integer.parseInt(br.readLine());
        System.out.print("메뉴 번호를 입력해주세요. : ");
        int menuNum = Integer.parseInt(br.readLine());

        Restaurant cu = new Restaurant(orderNum, phoneNum, address, orderDate, orderTime, menuNum);
    }
}
