package assignment;

public class Bus extends PublicTransport {


    Bus () {
        this.maxPassenger = 30;
        this.price = 1000;
        this.status = "운행 중";
    }

    public void setPassenger(int passenger) {
        if(this.passenger + passenger <= this.maxPassenger && this.status.equals("운행 중")) {
            this.income += price*passenger;
            this.passenger += passenger;
        }else if(this.passenger + passenger > this.maxPassenger){
            System.out.println("최대 승객 수 초과");
        }else if(this.status.equals("차고지행")) {
            System.out.println("차고지행이므로 탑승이 불가능합니다");
        }
    }

    public void setStatus(String status) {
        if(status.equals("차고지행")) {
            this.passenger = 0;
            this.income = 0;
        }
        this.status = status;
    }

    public void setOil(int oil) {
        this.oil += oil;
        if(this.oil < 10) {
            System.out.println("주유 필요");
            this.setStatus("차고지행");
        }
    }

}
