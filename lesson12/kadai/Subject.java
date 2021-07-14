package lesson12.kadai;

import java.util.ArrayList;

abstract class Subject {
  public ArrayList<TimeAdmin> timeAdmins;

  Subject() {
    timeAdmins = new ArrayList<TimeAdmin>();
  }

  public void attach(TimeAdmin o) {
    timeAdmins.add(o);
  }

  public void detach(TimeAdmin o) {
    timeAdmins.remove(o);
  }

  public void tsuuchi() {
    for (TimeAdmin timeAdmin : timeAdmins) {
      timeAdmin.update(this);
    }
  }
}
