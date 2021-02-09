package oo5;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean mudo;
    //==========================================================================
    // construtor    
    public ControleRemoto(){
        this.setLigado(false);
        this.setTocando(false);
        this.setMudo(false);
        this.setVolume(0);        
    }
    //==========================================================================
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
    
    public boolean isMudo(){
        return this.mudo;
    }    
    public void setMudo(boolean mudo){
        this.mudo = mudo;
    }    
    //==========================================================================
    //metodos
    @Override
    public void ligar() {
        if(this.isLigado() == false){            
            this.setLigado(true);
            this.setTocando(true);
            this.setMudo(false); // só por garantia. causo desligue com o mudo ligado
            this.setVolume(25); // 5 sinais de mais
            System.out.println("|| LIGANDO ||\n");
        }else{
            System.out.println("|| JÀ LIGADO ||\n");
        }        
    }
    //==========================================================================
    @Override
    public void desligar() {
        if(this.isLigado() == true){
            this.setLigado(false);
            this.setTocando(false);
            this.setVolume(0);
            System.out.println("|| DESLIGANDO ||");
        }else{
            System.out.println("|| JÁ DESLIGADO ||");
        }
    }
    //==========================================================================
    @Override
    public void abrirMenu() {
        if(this.isLigado() == true){            
            System.out.print("++-----------------------------++\n"+
                             "||            MENU             ||\n"+
                             "++-----------------------------||\n"+
                             "||  VOLUME: "+this.getVolume() +"\n"+
                             "|| " );
            if(this.isMudo() == false){
                for(int v=1; v<=this.getVolume(); v+=5){
                    System.out.print(" + ");
                }
            }                
            System.out.print("\n||  MUDO: "+ this.isTocando()+"\n"+                               
                             "||  ");
            if(this.isTocando()== true){
                System.out.print("PLAY\n");
            }else{
                System.out.println("PAUSE\n");
            }
            System.out.print("++-----------------------------++\n");
        }else{
            System.out.println("|| DESLIGADO ||");
        }
    }
    //==========================================================================
    @Override
    public void fecharMenu() {
        if(this.isLigado()==true){
            System.out.println("|| FECHANDO MENU . . . ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }
    }
    //==========================================================================
    @Override
    public void maisVolume() {
        if((this.isLigado() == true) && (this.isMudo() == false)){
            this.setVolume(this.getVolume() + 5);        
            System.out.println("|| MAIS VOLUME ||");
        }else if(this.isMudo() == true){
            System.out.println("|| MUDO ESTÁ LIGADO ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }
    }
    //==========================================================================
    @Override
    public void menosVolume() {
        if((this.isLigado() == true) && (this.isMudo() == false)){
            this.setVolume(this.getVolume() - 5);
            System.out.println("|| MENOS VOLUME ||");
        }else if(this.isMudo() == true){
            System.out.println("|| MUDO ESTÁ LIGADO ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }    
    }
    //==========================================================================
    @Override
    public void ligarMudo() {
        if((this.isLigado() == true)&&(this.getVolume() > 0) && (this.isMudo() == false)){
            this.setVolume(0);
            this.setMudo(true);
            System.out.println("|| MUDO LIGADO ||");
        }else if(this.getVolume() == 0){
            System.out.println("|| MUDO JÁ ESTÁ LIGADO ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }
    }
    //==========================================================================
    @Override
    public void desligarMudo() {
        if((this.isLigado() == true)&&(this.getVolume() == 0) && (this.isMudo() == true)){
            this.setVolume(25);
            this.setMudo(false);
            System.out.println("|| MUDO DESLIGADO ||");
        }else if(this.getVolume() > 0){
            System.out.println("|| MUDO JÁ ESTÁ DESLIGADO ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }    
    }
    //==========================================================================
    @Override
    public void play() {
        if(this.isLigado()==true){
            this.setTocando(true);
            System.out.println("|| PLAY ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }            
    }
    //==========================================================================
    @Override
    public void pause() {
        if((this.isLigado()==true)&&(this.isTocando()==true)){
            this.setTocando(false);
            System.out.println("|| PAUSE ||");
        }else{
            System.out.println("|| DESLIGADO ||");
        }
    }
    
      
    
}
