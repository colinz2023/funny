public class Hello {
    public native void displayHelloWorld();//所有native关键词修饰的都是对本地的声明
    static {
        System.loadLibrary("hello");//载入本地库
    }
    public static void main(String[] args) {
        Hello h = new Hello();
		h.displayHelloWorld();
    }
}


