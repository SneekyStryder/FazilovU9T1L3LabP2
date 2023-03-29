public class Taxi extends Car {
  private double fareCollected;
  private int fareMiles;

  public Taxi(String licensePlate, double tollFee, int passengers, int totalMiles, boolean isElectric, int fareMiles, double fareCollected) {
    super(licensePlate, tollFee, passengers, totalMiles, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
    this.fareMiles = fareMiles;
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

  @Override
  public void printMiles() {
    System.out.println("A total of " + fareMiles + " fare miles has been traversed");
  }
}