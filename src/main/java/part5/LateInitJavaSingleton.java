package part5;

public class LateInitJavaSingleton {
    private LateInitJavaSingleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static LateInitJavaSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final LateInitJavaSingleton INSTANCE = new LateInitJavaSingleton();
    }

    public static void main(String[] args) {
        System.out.println("시작");
        LateInitJavaSingleton instance = getInstance();
    }
}
