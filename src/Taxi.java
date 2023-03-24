public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public boolean chargeAndDropOffRiders(double farePerRider) {
    for (int i = 1; i <= getPassengers() - 1; i++) {
      fareCollected += farePerRider;
    }
    return dropOffPassengers(getPassengers() - 1);
  }

  public double getFareCollected() {
    return fareCollected;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Total Fare: " + fareCollected);
  }
}