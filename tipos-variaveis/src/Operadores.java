public class Operadores {

    public static void main(String[] args) { 
        
        //-----------------------------------------------------------------------------------//
        //Operadores Relacionais -->
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);



        System.err.println("------------------------------------------------------------------------------------");
        // Operadores lógicos --> E e OU
        


        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condiçoes são verdadeiras");
        }


        if(condicao1 || condicao2){
            System.out.println("Uma das condiçoes é verdadeira");
        }
        

    }



}
        

