package examples.callsuper;

public class AirplaneEx {
  public static void main(String[] args) {
    SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
    supersonicAirplane.takeOff();
    supersonicAirplane.fly();
    supersonicAirplane.flyMode = supersonicAirplane.SUPERSONIC;
    supersonicAirplane.fly();
    supersonicAirplane.flyMode = supersonicAirplane.NORMAL;
    supersonicAirplane.fly();
    supersonicAirplane.land();
  }
}
