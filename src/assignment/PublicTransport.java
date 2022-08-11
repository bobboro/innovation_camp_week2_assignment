package assignment;

import java.util.UUID;

public class PublicTransport {

    String id;
    int oil = 100;
    int speed = 0;
    int passenger;
    int maxPassenger;
    int price;
    int income;
    String status;

    PublicTransport () {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public int getOil() {
        return oil;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(this.getOil() >= 10) {
            this.speed += speed;
        }else {
            System.out.println("주유량을 확인해주세요");
        }

    }

    public int getPassenger() {
        return passenger;
    }

    public String getStatus() {
        return status;
    }

    public int getLeftSit() {
        return maxPassenger - passenger;
    }

    public int getIncome() {
        return income;
    }
}
