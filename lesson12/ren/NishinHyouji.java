package lesson12.ren;

interface Observer {
  public void update(Subject s);
}

class NishinHyouji implements Observer {
  public void update(Subject s) {
    print(((Suuchi) s).getValue());
  }

  private void print(int n) {
    System.out.println(n + "を 2 進数で表示します");
    //
    // ここに 2 進数表示処理を作成する
    //
  }
}
