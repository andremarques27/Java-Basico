package aula28;

public class ThreadSemaforo implements Runnable{

    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo(){
        this.cor = CorSemaforo.VERMELHO;

        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar){
            try {
                Thread.sleep(this.cor.getTempoEspera());
                this.mudarCor();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void mudarCor(){
        switch (this.cor){
            case VERMELHO ->
                this.cor = CorSemaforo.VERDE;
            case AMARELO ->
                    this.cor = CorSemaforo.VERMELHO;
            case VERDE ->
                    this.cor = CorSemaforo.AMARELO;
        }

        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar(){
        while (!this.corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.corMudou = false;
    }

    public synchronized void desligarSemaforo(){
        this.parar = true;
    }

    public CorSemaforo getCor() {
        return cor;
    }
}
