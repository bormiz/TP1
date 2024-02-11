import java.util.Scanner;
public class tp1{
    public static void main(String[] args){
        System.out.println("Bonjour,Mon premier tp en poo");
        System.out.println("Quelle est votre nom?");
        Scanner read = new Scanner (System.in);
        String name = read.next();
        System.out.println();
        System.out.println("Bonjour"+ name+"?");
        System.out.println("Quelle est votre age"+ name+"?");
        read = new Scanner (System.in);
        int a;
        a = read.nextInt();
        System.out.println(name +"votre age" + a);
    }
    public static double [] calculateProbability(int [] [] image){
        int occ=0;
        double [] T = new double [255];
        for (int i=0;i<255;i++){
            for(int j=0;j<image.length;j++){
                for (int k=0;k<image[j].length;k++){
                    if (image[j][k]==i)
                        occ+=1;
                }
            }
            T[i]=occ;
            }
            return(T);
        }
    public static double [] calculateEntropy(int [] [] image){
        double h=0;
        double [] prob = calculateProbability(image);
        for (int i=0;i<255;i++){
            h-=prob[i]*Math.log(prob[i]/Math.log(2));
        }
        rerturn (h);
    }
    }
}