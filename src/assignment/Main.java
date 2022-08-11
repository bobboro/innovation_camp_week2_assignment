package assignment;

public class Main {

    public static void main(String[] args) {

        // bus 2대 생성
        Bus busA = new Bus();
        Bus busB = new Bus();

        // bus 번호 다른지 확인
        System.out.println(busA.getId());
        System.out.println(busB.getId());

        // bus 승객 +2
        busA.setPassenger(2);

        // 출력
        System.out.println("a. 탑승 승객 수 = " + busA.getPassenger());
        System.out.println("b. 잔여 승객 수 = " + busA.getLeftSit());
        System.out.println("c. 요금 확인 = " + busA.getIncome());

        // bus 주유량 -50, 출력
        busA.setOil(-50);
        System.out.println("주유량 = " + busA.getOil());

        // bus 상태 변경 차고지행, 주유량 +10
        busA.setStatus("차고지행");
        busA.setOil(10);

        // bus 상태 변경 운행중
        busA.setStatus("운행 중");

        // bus 승객 +45, 알럿
        busA.setPassenger(45);

        // bus 승객 +5
        busA.setPassenger(5);

        // 출력
        System.out.println("a. 탑승 승객 수 = " + busA.getPassenger());
        System.out.println("b. 잔여 승객 수 = " + busA.getLeftSit());
        System.out.println("c. 요금 확인 = " + busA.getIncome());

        // bus 주유량 -55
        busA.setOil(-55);

        // 출력
        System.out.println("주유량 = " + busA.getOil());
        System.out.println(busA.getStatus());

        //-----------------------------------------------------
        System.out.println("-----------------------------");

        // taxi 2대 생성
        Taxi taxiA = new Taxi();
        Taxi taxiB = new Taxi();

        // 출력 Taxi
        System.out.println(taxiA.getId());
        System.out.println(taxiB.getId());
        System.out.println(taxiA.getOil());
        System.out.println(taxiA.status);

        // taxi 승객+2
        taxiA.setPassenger(2);
        taxiA.setDestination("서울역");
        taxiA.setDistanceToDestination(2);

        // 출력
        System.out.println("a. 탑승 승객 수 = " + taxiA.getPassenger());
        System.out.println("b. 잔여 승객 수 = " + taxiA.getLeftSit());
        System.out.println("c. 기본 요금 확인 = " + taxiA.getBasicPrice());
        System.out.println("d. 목적지 = " + taxiA.getDestination());
        System.out.println("e. 목적지까지 거리 = " + taxiA.getDistanceToDestination());
        System.out.println("f. 지불할 요금 = " + taxiA.getPrice());
        System.out.println("g. 상태 = " + taxiA.getStatus());

        // taxi 주유량 -80
        taxiA.setOil(-80);

        // 출력
        System.out.println("a. 주유량 = " + taxiA.getOil());
        System.out.println("b. 누적 요금 = " + taxiA.getIncome());

        // taxi 승객 +5, 알럿
        taxiA.setPassenger(5);

        // taxi 승객+3, 구로디지털단지역, 12km
        taxiA.setPassenger(3);
        taxiA.setDestination("구로디지털단지역");
        taxiA.setDistanceToDestination(12);

        // 출력
        System.out.println("a. 탑승 승객 수 = " + taxiA.getPassenger());
        System.out.println("b. 잔여 승객 수 = " + taxiA.getLeftSit());
        System.out.println("c. 기본 요금 확인 = " + taxiA.getBasicPrice());
        System.out.println("d. 목적지 = " + taxiA.getDestination());
        System.out.println("e. 목적지까지 거리 = " + taxiA.getDistanceToDestination());
        System.out.println("f. 지불할 요금 = " + taxiA.getPrice());

        // taxi 주유량 -20
        taxiA.setOil(-20);

        // 출력
        System.out.println("a. 주유량 = " + taxiA.getOil());
        System.out.println("b. 상태 = " + taxiA.getStatus());
        System.out.println("c. 누적 요금 = " + taxiA.getIncome());



    }

}
