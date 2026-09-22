class Students {
    void study() {
        System.out.println("Students are fool");
    }
}

class Clg extends Students {
    void feec() {
        System.out.println("Clg are sttler");
    }
}

public class InheritanceExample1 {

    public static void main(String[] args) {

        Clg l = new Clg();

        l.study();
        l.feec();
    }
}