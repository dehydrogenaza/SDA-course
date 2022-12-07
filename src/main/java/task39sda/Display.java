package task39sda;

public class Display implements Runnable {
    private int id;

    public Display(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        ResultsManagement resultsManagement = new ResultsManagement();

        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Double result = resultsManagement.getResult();

            System.out.println("[Display " + id + "], bestTime: " + result);
        }
    }
}
