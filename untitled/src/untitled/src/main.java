import java.util.Scanner;
    public class main {
         static Scanner lectura = new Scanner (System.in);
        public static void main(String[] args) {
        int opcion, op, cant;

        cajero persona_1 = new cajero(1234, 50);
        cajero persona_2 = new cajero(6548, 800);
            //Muestro la informacion de las cuentas
            System.out.println(persona_1);
            System.out.println(persona_2);

            System.out.println("Cajero ATM");
            System.out.println("1. Para ingresar dinero");
            System.out.println("2. Para retirar dinero");
            System.out.println("3. Salir");
            opcion=lectura.nextInt();
            switch ( opcion) {
                case 1:
                    //Ingresa dinero en las cuentas
                    System.out.println("Escoja la opcion de persona");
                    op=lectura.nextInt();
                    if(op == 1) {
                        System.out.println("Ingrese la cantidad a Depositar");
                        cant = lectura.nextInt();
                        persona_1.ingresar(cant);
                    } else{
                        System.out.println("Ingrese la cantidad a Depositar");
                        cant = lectura.nextInt();
                        persona_2.ingresar(cant);}
                    break;
                case 2:

                //Retiramos dinero en las cuentas
                               System.out.println("Escoja la opcion de persona");
                               op=lectura.nextInt();
                               if(op == 1) {
                                   System.out.println("Ingrese la cantidad a Retirar");
                                   cant = lectura.nextInt();
                                   persona_1.retirar(cant);
                               } else{
                                   System.out.println("Ingrese la cantidad a Retirar");
                                   cant = lectura.nextInt();
                                   persona_2.retirar(cant);}
                    break;
                case 3:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;

            }
            //Muestro la informacion de las cuentas
            System.out.println(persona_1);
            System.out.println(persona_2);
        }
}




