public class Torrada implements Runnable {
    @Override
    public void run() {
        System.out.println("Torrada: Colocando o pão na torradeira...");
        try {
            //atrasa a execução do thread em 3 seg.
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao fazer a torrada.");
        }
        System.out.println("Torrada: Pronta e quentinha!");
    }
}
