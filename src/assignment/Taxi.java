package assignment;

public class Taxi extends PublicTransport{

    int basicPrice = 3000;
    int pricePerDistance = 1000;
    int basicDistance = 1;
    String destination;
    int distanceToDestination;
    int income = 1000;

    Taxi () {
        this.maxPassenger = 4;
        this.status = "일반";
    }

    public void setPassenger(int passenger) {
        if (passenger < 5) {
            this.status = "운행 중";
            this.passenger = passenger;
        }else {
            System.out.println("최대 승객 수 초과");
        }
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDistanceToDestination(int distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public int getDistanceToDestination() {
        return distanceToDestination;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public int getPrice() {
        return basicPrice + (pricePerDistance*(distanceToDestination-basicDistance));
    }

    public int getIncome() {
        return this.income += getPrice();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOil(int oil) {
        this.oil += oil;
        if(this.oil < 10) {
            System.out.println("주유 필요");
            this.setStatus("운행불가");
        }
    }


}
