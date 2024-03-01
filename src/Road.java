public class Road {

  private int arrivalCity, departureCity;

  public Road(int departureCity, int arrivalCity){
    this.departureCity = departureCity;
    this.arrivalCity = arrivalCity;
  }

  public int getArrivalCity() {
    return arrivalCity;
  }

  public int getDepartureCity() {
    return departureCity;
  }
}