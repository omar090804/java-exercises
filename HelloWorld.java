public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        char w = 'a';
        String helloWorld = "hello world";
        String ris = "";

        for (int i = 0;!ris.equals(helloWorld) ; ) {
            if (w != helloWorld.charAt(i)) {
                System.out.println(ris + w++);
                Thread.sleep(200);
            } else {
                i++;
                ris += w;
                w = 'a';
            }
            if (ris.equals("hello")) {
                ris += " ";
                i++;
            }
        }
        System.out.print(ris+" !");


    }
}