package otrher;

class A {
    private int x = 1;

    @Override
    public boolean equals(Object obj) {
        System.out.println("entro a " + this.getClass() + " and " + obj.getClass());
        if (obj == null) return false;
        if (getClass() != obj.getClass())
            return false;
        A a = (A) obj;
        return a.x == x;
    }
}

class B extends A {
    private int x = 2;
    private String Y = "b";


    @Override
    public boolean equals(Object obj) {
        System.out.println("entro b " + this.getClass() + " and " + obj.getClass());
        if (obj == null) return false;
        if (getClass() != obj.getClass())
            return false;
        B b = (B) obj;
        return b.x == x && b.Y.equals(Y);
      //  System.arraycopy(init, indexInit, destino, indexDestino, howManyCopy);
    }
}

class C extends B {
    private int w = 3;

    public static void main(String[] args) {
        C c1c = new C();
        C c2c = new C();
        System.out.println(c1c.equals(c2c));
    }

}

class a {
    int x = 2;

    class b {
        class c {
            public int calculate() {
                class d {
                    int suma() {
                        return x * 2;
                    }
                }
                return new d().suma();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new a().new b().new c().calculate(););
    }
}
