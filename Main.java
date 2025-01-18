public class Main {
    public static void main(String[] args) {
        Thread infiniteCounter = new Thread(new Runnable() {
            @Override
            public void run() {
                int number = 1;
                try {
                    while (true) {
                        System.out.println(number);
                        number++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        });

        infiniteCounter.start();
    }
}
