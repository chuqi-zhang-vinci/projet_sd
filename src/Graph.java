import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {

  private File cityFile, roadFile;
  private Map<City, Set<Road>> outputRoads;

  public Graph(File cityFile, File roadFile){
    this.cityFile = cityFile;
    this.roadFile = roadFile;
    outputRoads = new HashMap<>();
  }

  public String calculerItineraireMinimisantNombreRoutes(String villeDepart, String villeArrivee){
    return null;
  }

  public String calculerItineraireMinimisantKm(String villeDepart, String villeArrivee){
    return null;
  }

  protected void ajouterSommet(City c) {
    Set<Road> roads = new HashSet<>();
    outputRoads.put(c, roads);
  }

  protected void ajouterArc(Road r) {
    int idCity = r.getDepartureCity();
    for(City elem : outputRoads.keySet()){
      if(elem.getId() == idCity){
        outputRoads.get(elem).add(r);
      }
    }
  }

  public Set<Road> arcsSortants(City c) {
    return outputRoads.get(c);
  }

  public boolean sontAdjacents(City c1, City c2){
    for (Road elem : outputRoads.get(c1)) {
      if (elem.getArrivalCity() == c2.getId()) {
        return true;
      }
    }
    for (Road elem : outputRoads.get(c2)) {
      if (elem.getArrivalCity() == c1.getId()) {
        return true;
      }
    }
    return false;
  }
}