class M {
    int i; // Fixed: Removed the invalid variable name "2i"
    String str; // Fixed: Removed the invalid variable name "@str"

    M(int i, String str) {
        this.i = i; // Fixed: Added "this." to refer to the instance variable
        this.str = str; // Fixed: Added "this." to refer to the instance variable
    }

    void printF() { // Fixed: Added the return type "void"
        System.out.println("Printing"); // Fixed: Changed "println" to "System.out.println"
    }

    public static class ans {

            public static void main(String[] args) {
                M m = new M(42, "Hello");
                m.printF();
            }

    }
}


