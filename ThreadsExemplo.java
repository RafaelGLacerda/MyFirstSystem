public class ThreadsExemplo extends Thread {
    private String mensagem;

    public ThreadsExemplo(String mensagem) {
        this.mensagem = mensagem;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(mensagem);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida");
            }
        }
    }

    public static void main(String[] args) {
        ThreadsExemplo thread1 = new ThreadsExemplo("Função execultada 1");
        ThreadsExemplo thread2 = new ThreadsExemplo("Função execultada 2");
        thread1.start();
        thread2.start();
    }
}
