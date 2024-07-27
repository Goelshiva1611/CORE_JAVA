
class stud {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.print("hello");

        int a = 10;
        double c = a;
        double b = 20.899;
        int d = (int) b;
        // type conversion will be done at there
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("helllo");
            System.out.println("i");
        }

        int f = 20;
        switch (f) {
            case 2:
                System.out.println("Yes you in right place");
                break;
            case 3:
                System.out.print("no right place");
            default:
                System.out.println("defautl");
        }

    }
}
