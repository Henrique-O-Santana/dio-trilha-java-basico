public class Contador {

    public void contador(int n1, int n2) throws ParametrosInvalidosException{
        if (n1>=n2)
            throw new ParametrosInvalidosException();
        else{
            int cont = n2-n1;
            for (int i=0; i<cont; i++){
                System.out.println("Imprimindo numero "+(i+1));
            }
        }
    }
}
