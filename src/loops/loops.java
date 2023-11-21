package loops;

public class loops {

    public static void main(String[] args){

        int i=1;
        while(i<=5){
            System.out.println(i+" , Welcome to the basics");
            i++;
        }
        System.out.println("Values of i " +i);
        System.out.println();


        int j=0;
        do{
            System.out.println(j+ ", Welcome all!! ");
            j++;
        }while (j<=0);

        System.out.println("Values of j " +j);
        System.out.println();


        for (int k = 1; k<=5; k++){
            if(k ==3){
                break;
            }
            System.out.println(k +". BEING RIGHT SUCKS");
        }
        System.out.println();

        for (int k = 1; k<=5; k++){
            for (int l = 1; l<=2; l++){
                System.out.println("k=" + k + " l=" + l + " BEING RIGHT SUCKS");
            }
        }
        System.out.println();
    }
}

