import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; 
import Paquete.*;

public class menus {

    int opcionMenu = 0;
    int eliminacionUsuario;
    int eliminacionJuego;
    static Scanner leeOpcionMenu = new Scanner(System.in);
    static Scanner leeDatos = new Scanner(System.in);
    static Scanner variable = new Scanner(System.in);
    
    ArrayList<MiembroClub> listaMiembrosClub = new ArrayList<MiembroClub>();
    ArrayList<Juego> listaJuegos = new ArrayList<Juego>();
    ArrayList<Alquiler> listaAlquileres = new ArrayList<Alquiler>();

    void crearDataInicio(){

        MiembroClub cliente1 = new MiembroClub("1", "Juan", "Perez", "Villa Nueva",123456);
        listaMiembrosClub.add(cliente1);
        MiembroClub cliente2 = new MiembroClub("2", "Jose", "Perez", "Villa Nueva",123456);
        listaMiembrosClub.add(cliente2);
        MiembroClub cliente3 = new MiembroClub("3", "Toto", "Perez", "Villa Nueva",123456);
        listaMiembrosClub.add(cliente3);

        Juego juego1 = new Juego("1","FortNite");
        listaJuegos.add(juego1);
        Juego juego2 = new Juego("2","Halo");
        listaJuegos.add(juego2);
        Juego juego3 = new Juego("3","FIFA");
        listaJuegos.add(juego3);
    }

    void menuPrincipal() {
        do {
            crearDataInicio();
            System.out.println(" ************ Menu ****************");
            System.out.println("* 1 - Clientes                     *");
            System.out.println("* 2 - Juegos                       *");
            System.out.println("* 3 - Alquileres                   *");
            System.out.println("* 4 - Reporte 1                    *");
            System.out.println("* 5 - Reporte 2                    *");
            System.out.println("* 6 - Reporte 3                    *");
            System.out.println("* 7 - Regresar al menu anterior    *");
            System.out.println(" **********************************");
            opcionMenu = leeOpcionMenu.nextInt();
            switch (opcionMenu) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuJuegos();
                    break;

                case 3:
                    menuAlquiler();
                    break;
                case 4:
                    //reporte1();
                    break;
                case 5:
                    //reporte2();
                    break;
                case 6:
                    //reporte3();
                    break;
                case 7:
                    //no hace nada porque regresa al menu anterior
                    break;
                default:
                    System.out.println(" Opcion Incorrecta");
                    break;

            }
        } while (opcionMenu != 7);

    }

    void menuClientes() {
        System.out.println(" ******* Menu Clientes ************");
        System.out.println("* 1 - Ingreso Clientes             *");
        System.out.println("* 2 - Eliminar membresia           *");
        System.out.println(" **********************************");
        int opcionMenu = leeOpcionMenu.nextInt();
        switch(opcionMenu){
            case 1:
                crearCliente();
                break;
            case 2:
                borrarCliente();
                break;
        }
    }

    void crearCliente(){

    	System.out.println("                    ");
        String y = leeOpcionMenu.nextLine();
        System.out.println("Ingrese ID                      **");
        String id = leeOpcionMenu.nextLine();
        System.out.println("Ingrese Nombre                  **");
        String nombre = leeOpcionMenu.nextLine();
        System.out.println("Ingrese Apellido                **");
        String apellido = leeOpcionMenu.nextLine();
        System.out.println("Ingrese Direccion               **");
        String direccion = leeOpcionMenu.nextLine();
        System.out.println("Ingrese tel                     **");
        int tel = leeOpcionMenu.nextInt();

        MiembroClub clienteNuevo = new MiembroClub(id,nombre,apellido,direccion,tel);

        listaMiembrosClub.add(clienteNuevo);
        System.out.println(listaMiembrosClub);

    }
    void borrarCliente(){

    System.out.println("Ingrese el Id a eliminar");

    eliminacionUsuario = leeOpcionMenu.nextInt(); 

    listaMiembrosClub.remove(new Integer(eliminacionUsuario));

    System.out.println(listaMiembrosClub);
    System.out.println("Se removio correctamente el Miembro del club");
    System.out.println("Espero pronto vuelvas a comprar con nosotros");
    System.out.println("Att: Videojuegos Kinal");
    }

    void menuJuegos() {
        System.out.println(" ************ Menu Juegos ****************");
        System.out.println("* 1 - Ingreso Juego                      **");
        System.out.println("* 2 - Eliminar Juego                       *");
        System.out.println(" ********************************************");
         int opcionMenu = leeOpcionMenu.nextInt();

         switch(opcionMenu){

            case 1:
                crearJuego();
                break;

            case 2:
                eliminarJuego();
                break;
        }
    }

    void crearJuego(){

    	System.out.println("                    ");
        String y = leeOpcionMenu.nextLine();

    	System.out.println("Ingrese ID **");
        String id = leeOpcionMenu.nextLine();
        System.out.println("Ingrese Nombre **");
        String nombre = leeOpcionMenu.nextLine();

         Juego juegoNuevo = new Juego(id,nombre);

        listaJuegos.add(juegoNuevo);
        System.out.println(listaJuegos);

    }

    void menuAlquiler() {
        System.out.println(" ******* Menu Alquiler ************");
        System.out.println("* 1 - Ingreso Alquiler             *");
        System.out.println("* 2 - Ingreso Devolucion           *");
        System.out.println(" **********************************");
        int opcionMenu = leeOpcionMenu.nextInt();

         switch(opcionMenu){

            case 1:
                ingresoAlquiler();
                break;

            case 2:
                devolucionAlquiler();
                break;
        }
    }

      void ingresoAlquiler() {

      	System.out.println("                    ");
        String y = leeOpcionMenu.nextLine();

      	System.out.println("Ingrese El ID del Miembro **");
        String idMiembro = leeOpcionMenu.nextLine();

        System.out.println("Ingrese El Id del Juego Existente **");
        String idJuego = leeOpcionMenu.nextLine();

        System.out.println("Reingrese El Id del Juego Que Quire **");
        String activo = leeOpcionMenu.nextLine();

        Alquiler alquilerNuevo = new Alquiler(idMiembro,idJuego,activo);

        listaAlquileres.add(alquilerNuevo);
        System.out.println(listaAlquileres);

        System.out.println(" -----------------------------------");
        System.out.println("|Por cuantos dias alquilara su juego|");
        System.out.println(" -----------------------------------");
        int dias = leeOpcionMenu.nextInt();

        if (dias > 0){
        for (int i = 8; i >= dias; i++){
        System.out.println(" El total de: " + dias + " dias" + " Usted debe de pagar: " + dias*8 + " Quetzales por cada juego rentado ");
         break;
           } 
        }

      }
      void devolucionAlquiler() {

        System.out.println("-------Menu de devolucion-------");
        System.out.println("1. - Metodo: Id                -");
        System.out.println("2. - Metodo: Nombre del juego  -");
        System.out.println("--------------------------------");
        int opcionMenu = leeOpcionMenu.nextInt();

        switch(opcionMenu){

            case 1:
            //void para devolucion;

            case 2:
            //otro void para el nombre
        }


      }
      void metodoId(){
        System.out.println("-----Escogio método por ID del juego-----");
        System.out.println("Introduzca el Id del juego              -");
      }
      void eliminarJuego(){
        System.out.println("-----Bienvenido a eliminar juego-----");
        System.out.println("Ingrese el Id del juego a eliminar  -");

        eliminacionJuego = leeOpcionMenu.nextInt();

        listaJuegos.remove(new Integer(eliminacionJuego));

        System.out.println(listaJuegos);

        System.out.println("Juego exitosamente removido");
      }
}