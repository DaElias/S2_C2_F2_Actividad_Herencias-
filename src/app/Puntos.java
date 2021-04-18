package app;

public class Puntos {

    private int x, y;

    public Puntos() {
        this.x = 0;
        this.y = 0;
    }

    public Puntos(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
