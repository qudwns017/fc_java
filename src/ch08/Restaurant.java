package ch08;

public class Restaurant {
    private int orderNum;
    private int phoneNum;
    private String address;
    private int orderDate;
    private int orderTime;
    private int menuNum;

    Restaurant(int orderNum, int phoneNum, String address, int orderDate, int orderTime, int menuNum) {
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.menuNum = menuNum;

        getOrderInfo();
    }

    public void getOrderInfo() {
        System.out.println("주문 접수 번호 : " + orderNum);
        System.out.println("주문 핸드폰 번호 : " + phoneNum);
        System.out.println("주문 집 주소 : " + address);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("메뉴 번호 : " + menuNum);
    }
}
