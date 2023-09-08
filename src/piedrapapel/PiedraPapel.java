
package piedrapapel;
import java.util.Scanner;
public class PiedraPapel {

    public static void main(String[] args) {
    Scanner teclado =  new Scanner (System.in);
    
        System.out.println("juevo de piedra, papel, tijeras, lagarto, spock");
    //String Piedra, Papel, Tijeras, Lagarto, Spock;
    int opc1, opc2; 
        System.out.println("ingrese el numero de su eleccion");
        System.out.println("1 = piedra");
        System.out.println("2 = papel");
        System.out.println("3 = tijeras");
        System.out.println("4 = lagarto");
        System.out.println("5 = spock");
        
        opc1 = teclado.nextInt();
        System.out.println("el otro jugador debe elejir una opcion");
            System.out.println("ingrese el numero de su eleccion");
        System.out.println("1 = piedra");
        System.out.println("2 = papel");
        System.out.println("3 = tijeras");
        System.out.println("4 = lagarto");
        System.out.println("5 = spock");
        
        opc2 = teclado.nextInt();
        
    if (opc1 == 1 && opc2 == 4){
        System.out.println("piedra aplasta a lagarto");
    } else {
        if (opc1 == 1&& opc2 == 2){
            System.out.println("papel tapa a piedra");
        }
        //else {
        if (opc1 ==1 && opc2==5){
            System.out.println("spock vaporiza piedra");
        }
        //else {
        if (opc1 ==1 && opc2==3){
            System.out.println("piedra aplasta a tijeras");
        }
        //else {
        if (opc1 ==3 && opc2== 2){
            System.out.println("tijeras cortan papel");
        }
        //else {
        if (opc1 ==3 && opc2 == 5){
            System.out.println("Spock rompe tijeras");
        }
        //else {
        if (opc1 ==3 && opc2 == 4){
            System.out.println("tijeras decapitan a lagarto");
        }
        //else {
        if (opc1 ==3 && opc2==1){
            System.out.println("piedra aplasta a tijeras");
        } 
        //else {
        if (opc1 ==2 && opc2==1){
            System.out.println("papel tapa a piedra");
        }
        //else {
        if (opc1 ==2 && opc2==4){
            System.out.println("lagarto devora a papel");
        }
        //else {
        if (opc1 ==2 && opc2==5){
            System.out.println("papel desautiriza spock");
        }
        //else {
        if (opc1 ==2 && opc2==4){
            System.out.println("lagarto devora a papel");
        }
        //else {
        if (opc1 ==4 && opc2==1){
            System.out.println("piedra aplasta a lagarto");
        }
        //else {
        if (opc1 ==4 && opc2==2){
            System.out.println("lagarto envenena a spock");
        }
        //else {
        if (opc1 ==4 && opc2==3){
            System.out.println("tijeras decapitan lagarto");
        }
        //else {
        if (opc1 ==4 && opc2==2){
            System.out.println("lagarto devora papel");
        }
        //else {
        if (opc1 ==5 && opc2==4){
            System.out.println("lagarto envenena a Spock");
        }
        //else {
        if (opc1 ==5 && opc2==3){
            System.out.println("Spock rompe tijeras");
        }
        //else {
        if (opc1 ==5 && opc2==2){
            System.out.println("papel desautoriza Spock");
        }
        //else {
        if (opc1 ==5 && opc2==4){
            System.out.println("Spock vaporiza piedra");
        }
        //else {
        if (opc1 == opc2){
            System.out.println("empate");
        }
        System.out.println("la pirmera eleccion fue: "+opc1+" la segunda eleccion fue: "+opc2);
        }//}}}}}}}}}}}}}}}}}}}
        
        
    
    }

}
