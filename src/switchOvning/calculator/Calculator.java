package switchOvning.calculator;

public class Calculator {
    private int x, y;
    static char operation;

    public int result() {
        switch (operation) {
            case '+': return x + y;
        }
        return -1;
    }

    public void setX(int i) {
        this.x = i;
    }

    public void setY(int i) {
        this.y = i;
    }

    public void setOperation(char c) {
        this.operation = c;
    }

    public static int resultStatic(int x, int y,char operation){
        switch (operation) {
            case '+': return x + y;
        }
        return -1;
    }
}
