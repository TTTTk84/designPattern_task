package lesson12.kadai;

import java.util.Calendar;

class ConcreteSubject extends Subject {

  int getHour() {
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    return hour;
  }

  public void alert() {
    this.tsuuchi();
  }
}
