import java.util.Scanner;

public class Banco {
    public static void main(String[] args ){
        System.out.println("Ingresa la cantidad de clientes");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        Cliente c;
        //c.agregar();

        Cliente cl[]= new Cliente[x];

        for (int i=0;i<cl.length;i++){
            System.out.println("Ingresa los datos del cliente");
            String Nom= sc.nextLine();
            String Apell= sc.nextLine();
            String CC= sc.nextLine();
            String Residencia= sc.nextLine();
            String Prof= sc.nextLine();
            int Celular= sc.nextInt();
            int Tc= sc.nextInt();
            int Clavetc= sc.nextInt();
            int Td= sc.nextInt();
            int Clavetd= sc.nextInt();
            int ca=sc.nextInt();
            int cc=sc.nextInt();
            int prest=sc.nextInt();
            cl[i]=new Cliente (Nom,Apell,CC,Residencia,Prof,Celular,Tc,Clavetc,Td,Clavetd,ca,cc,prest);

        }
        System.out.println(cl[0].getApellido());

    }
}
