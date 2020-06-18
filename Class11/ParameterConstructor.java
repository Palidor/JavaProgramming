package Class11;

public class ParameterConstructorDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(89);

        System.out.println(t1.getX() + " " + t2.getX());
    }

    public static class MyClass {
        private int x;

        public MyClass() {
            x = 10;
        }

        public MyClass(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }
    }
}