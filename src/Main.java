public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o preparo do café da manhã...\n");
        Torrada tarefaTorrada = new Torrada();
        Thread threadTorrada = new Thread(tarefaTorrada);

        threadTorrada.start();

        Thread threadAgua = new Thread(() -> {
            System.out.println("Água: começando a esquentar...");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Erro ao ferver a água");
            }
            System.out.println("Água: Ferveu! Pronta para o café");
        });
        threadAgua.start();
    }
}