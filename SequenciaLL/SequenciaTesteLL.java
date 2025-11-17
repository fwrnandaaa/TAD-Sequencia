public class SequenciaTesteLL{
    public static void main(String[] args){
        TadSequenciaLL v = new TadSequenciaLL();
        TadSequenciaLL.Node aux1 = new TadSequenciaLL.Node(15);
        TadSequenciaLL.Node aux2 = new TadSequenciaLL.Node(16);
        TadSequenciaLL.Node aux3 = new TadSequenciaLL.Node(17);
        TadSequenciaLL.Node aux4 = new TadSequenciaLL.Node(18);
        v.insertFirst(aux1);
        v.insertFirst(aux2);
        v.insertFirst(aux3);
        v.insertFirst(aux4);
        v.verSequenciaLL();
        System.out.println("sei la: "+ v.before(aux2));
        System.out.println("sei la: "+ v.after(aux4));
    }
}