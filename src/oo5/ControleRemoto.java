package oo5;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // construtor
    
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
        
    }
    
    //geters and setters
    
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    public boolean isTocando(){
        return this.tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    //metodos

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("|| LIGADO ||\n");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("|| DESLIGADO ||\n");
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()==true){
            System.out.println("|| ================================== ||");
            System.out.println("|| LIGADO: "+this.isLigado()+" ||");
            System.out.print("|| VOLUME: "+this.getVolume()+" ");
            for(int v=1;v<=this.getVolume();v+=10){
                System.out.print(" + ");
            }
            System.out.println("\n|| ================================== ||");
            System.out.println("");
        }else{
            System.out.println(". . . . .");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()==true){
            System.out.println("|| FECHANDO MENU . . . ||");
        }else{
            System.out.println("|| . . . . . ||");
        }
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()==true){
            this.setVolume(this.getVolume()+10);
        }else{
            System.out.println("|| . . . . . ||");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()==true){
            this.setVolume(this.getVolume()-10);
        }else{
            System.out.println("|| . . . . . ||");
        }
    }

    @Override
    public void ligarMudo() {
        if((this.isLigado()==true)&&(this.getVolume()>0)){
            this.setVolume(0);
        }else{
            System.out.println("|| . . . . . ||");
        }
    }

    @Override
    public void desligarMudo() {
        if((this.isLigado()==true)&&(this.getVolume()==0)){
            this.setVolume(50);
        }else{
            System.out.println("|| . . . . . ||");
        }
    }

    @Override
    public void play() {
        if(this.isLigado()==true){
            this.setTocando(true);
            System.out.println("|| TOCANDO ||");
        }else{
            System.out.println("|| . . . . . ||");
        }
            
    }

    @Override
    public void pause() {
        if((this.isLigado()==true)&&(this.isTocando()==true)){
            this.setTocando(false);
            System.out.println("|| PAUSE ||");
        }else{
            System.out.println("|| . . . . . ||");
        }
    }
    
      
    
}
