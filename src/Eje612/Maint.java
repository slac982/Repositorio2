package Eje612;


public class Maint {

    
    public static void main(String[] args) {
        int[] lista1 = new int[100];
        int[] lista2 = new int[100];
        int[] lista3 = new int[100];
        
        
        //reinar las dos listas
        for(int i = 0; i < lista1.length; i++){
            lista1[i] = (int) (Math.random() * 1000 + 1);
            lista2[i] = (int) (Math.random() * 1000 + 1);
        }
        
        //Impremir la lista 1
        System.out.println("La primera Lista: ");
        for(int i = 0; i < lista1.length; i++){
            if(i%10!=1 ){
                System.out.print(lista1[i]+"\t");
            }else{
                System.out.println(lista1[i]+"\t");}
        }
        
        //Impremir la lista 2
        System.out.println("\n\nLa segunda Lista: ");
        for(int i = 0; i < lista2.length; i++){
            if(i%10!=1 ){
                System.out.print(lista2[i]+"\t");
            }else{
                System.out.println(lista2[i]+"\t");}
        }
        
        //Reinar la lista 3 con el numero mayor de las dos listas
        for(int i = 0; i<lista1.length; i++){
            if(lista1[i]>lista2[i]){
            lista3[i] = lista1[i];
            }else{
                lista3[i]=lista2[i];
            }
        }
        
        
        //Impremir la lista 3
        System.out.println("\n\nLa segunda Lista: ");
        for(int i = 0; i < lista3.length; i++){
            if(i%10!=1 ){
                System.out.print(lista3[i]+"\t");
            }else{
                System.out.println(lista3[i]+"\t");}
        }
    System.out.println("");
    }
    
}
