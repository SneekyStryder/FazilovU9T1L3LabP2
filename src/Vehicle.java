public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  private int totalMiles;
  
  public Vehicle(String licensePlate, double tollFee, int passengers, int totalMiles)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
    this.totalMiles = totalMiles;
  }

  public String getLicensePlate()
  {
    return licensePlate;
  }

  public double getTollFee()
  {
    return tollFee;
  }

  public void setTollFee(double newValue)
  {
    tollFee = newValue;
  }

  public int getPassengers()
  {
    return passengers;
  }

  public void setPassengers(int newValue)
  {
    passengers = newValue;
  }

  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  public void printInfo() {
    System.out.println("License Plate: " + licensePlate);
    System.out.println("Toll Fee: " + tollFee);
    System.out.println("Passengers: " + passengers);
  }

  public void printMiles() {
    System.out.println("A total of " + totalMiles + " has been traversed");
  }
}
