import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
  public static void main(String[] args) {
    Flower rose = new Flower(1, "バラ");

    System.out.println("名前:" + rose.getName());
    System.out.println("色:" + rose.getColor().getColorName());
  }
}

class Flower {
  private int colorNumber;
  private String name;

  Flower(int colorNumber, String name) {
    this.colorNumber = colorNumber;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Color getColor() {
    return transColorNum();
  }

  private Color transColorNum() {
    ColorRepository cr = ColorRepository.getInstance();
    return cr.searchIdtoColor(colorNumber);
  }

}

class Color {
  private int colorNumber;
  private String name;
  private int r, g, b;

  Color(int id, String name, int r, int g, int b) {
    this.colorNumber = id;
    this.name = name;
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public int getColorNumber() {
    return colorNumber;
  }

  public String getColorName() {
    return name;
  }
}

class ColorRepository {
  private List<Color> colors;

  private static ColorRepository cr = new ColorRepository();

  private ColorRepository() {
    colors = new ArrayList<Color>() {
      {
        add(new Color(1, "red", 255, 0, 0));
        add(new Color(2, "green", 0, 255, 0));
        add(new Color(3, "blue", 0, 0, 255));
      }
    };
  }

  public static ColorRepository getInstance() {
    return cr;
  }

  public Color searchIdtoColor(int id) {
    for (Color color : colors) {
      if (color.getColorNumber() == id) {
        return color;
      }
    }
    return null;
  }
}
