package edu.bu.met.homework6;

interface Observable {
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers(DeliveryRequest request);
}


