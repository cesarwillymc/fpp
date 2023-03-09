package prog1;

public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private MySingleton(){
    }
    static public MySingleton getInstance(){
        return instance;
    }
}

