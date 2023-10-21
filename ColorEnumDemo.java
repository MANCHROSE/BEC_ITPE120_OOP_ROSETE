
enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    MAGENTA(255, 0, 255),
    CYAN(0, 255, 255),
    BLACK(0, 0, 0),
    WHITE(255, 255, 255);

    private int red;
    private int green;
    private int blue;

    
    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    
    public void displayRGB() {
        System.out.println(this.name() + " - Red: " + red + ", Green: " + green + ", Blue: " + blue);
    }
}

public class ColorEnumDemo {
    public static void main(String[] args) {
        
        for (Color color : Color.values()) {
            color.displayRGB();
        }
    }
}