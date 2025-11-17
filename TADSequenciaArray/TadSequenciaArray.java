public class TadSequenciaArray{
    private int size;
    private Object[] tad_sequencia;
    private int capacidade;

    public TadSequenciaArray(int capacidade){
        tad_sequencia = new Object[capacidade];
        size = 0;
        this.capacidade=capacidade;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public Object elemAtRank(int r){
        if(isEmpty()){
            throw new TadSequenciaExcecao("O array está vazio.");
        }
        if(r >=size){
            throw new TadSequenciaExcecao("O rank informado é maior que o tamanho do array.");
        }
        return tad_sequencia[r];
    }
    public void verSequencia(){
        for(int i=0;i<size;i++){
            System.out.println(tad_sequencia[i]+"");
        }
    }
    public void insertFirst(Object O){
        if(size==0){
            tad_sequencia[0]=O;
        }
        else{
            for(int i =size; i>=0;i--){
                tad_sequencia[i] = tad_sequencia[i-1];
            }
        }
        tad_sequencia[0]=O;
        size++;
    }
}