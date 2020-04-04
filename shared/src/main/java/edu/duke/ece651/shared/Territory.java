package edu.duke.ece651.shared;

import java.util.*;

public class Territory {
  private String owner;
  private HashMap<Integer, Integer> soldiers;
  private ArrayList<String> neighbor;
  private String territoryName;
  public Territory() {
    neighbor = new ArrayList<String>();
    soldiers = new HashMap<>();
    soldiers.put(0, 0);
    soldiers.put(1, 0);
    soldiers.put(2, 0);
    soldiers.put(3, 0);
    soldiers.put(4, 0);
    soldiers.put(5, 0);
    soldiers.put(6, 0);
  }
  public String getOwner() {
    return owner;
  }

  public HashMap<Integer, Integer> getSoldiers() {
    return soldiers;
  }
  public int getSoldierLevel(int level) {
    return soldiers.get(level);
  }

  public void setSoldiers(HashMap<Integer, Integer> soldierMap) {
    for (HashMap.Entry<Integer, Integer> entry : soldierMap.entrySet()) {
      soldiers.put(entry.getKey(), entry.getValue());
    }
  }

  public void setSoldierLevel(int level, int num) {
    soldiers.put(level, num);
  }

  public void setSoldiers() {}

  public ArrayList<String> getNeighbor() {
    return neighbor;
  }
  public String getTerritoryName() {
    return territoryName;
  }
  public void setOwner(String Owner) {
    owner = Owner;
  }

  public void setNeighbor(String neigh) {
    neighbor.add(neigh);
  }
  public void setTerritoryName(String Name) {
    territoryName = Name;
  }
}
