package Casino;

import java.util.Scanner;

public class MainCasino {
    private static int bancaJugador = 100;
    private static int bancaCasino = 500;
    private static final int MINIMOJUEGO = 10;
    private static final int MINIMOJUEGOVIDAMUERTE = 12;

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quiereSeguirJugando = true;

        while (bancaJugador > 10 && quiereSeguirJugando) {
            System.out.println("Cuánto quieres apostar, mínimo 10 euros");
            int apuesta = in.nextInt();
            while (apuesta < MINIMOJUEGO || apuesta > bancaJugador) {
                System.out.println("Introduce una apuesta válida");
                apuesta = in.nextInt();
            }
            bancaJugador -= apuesta;
            System.out.println("Apuesta hecha, tu nueva banca es " + bancaJugador);

            boolean seguirJugando;
            do {
                int tirada1Jugador = (int) (Math.random() * 6) + 1;
                int tirada2Jugador = (int) (Math.random() * 6) + 1;
                int resultado = tirada1Jugador + tirada2Jugador;
                seguirJugando = false;

                if (resultado == 7 || resultado == 11) {
                    System.out.println("¡Has ganado!!");
                    int ganancia = apuesta * 2;
                    bancaJugador += ganancia;
                    bancaCasino -= ganancia;
                    System.out.println("Tu nueva banca es " + bancaJugador);
                } else if (resultado == 2 || resultado == 3 || resultado == 10 || resultado == 12) {
                    System.out.println("Has perdido");
                    bancaCasino += apuesta;
                    System.out.println("Tu nueva banca es " + bancaJugador);
                } else {
                    System.out.println("Resultado indeterminado con " + resultado + ", tirando de nuevo sin apuesta adicional.");
                    seguirJugando = true;
                }
            } while (seguirJugando);

            // Preguntar si quiere seguir jugando solo si la banca del jugador es mayor a 10
            if (bancaJugador > 10) {
                System.out.println("¿Quieres seguir jugando? (si/no)");
                in.nextLine(); // Limpiar buffer
                String opcion = in.nextLine();
                quiereSeguirJugando = opcion.equalsIgnoreCase("si");
            }
        }


        if (bancaJugador <= 10) {
            System.out.println("Quieres jugar a Vida o muerte, apuestas todo y elige un número del 2 al 12. Si aciertas, te quedas con todo el dinero de la banca, sino perderás todo. ¿Deseas jugar? (si/no)");
            in.nextLine(); // Limpiar buffer
            String decision = in.nextLine();
            if (decision.equalsIgnoreCase("si")) {
                System.out.println("Vamos a ello. Adivina el número:");
                int numeroVidaMuerte = (int) (Math.random() * MINIMOJUEGOVIDAMUERTE) + 1;
                int numeroDecisivo = in.nextInt();
                if (numeroDecisivo == numeroVidaMuerte) {
                    System.out.println("Has acertado, tienes todo el dinero de la banca.");
                    bancaJugador += bancaCasino;
                    bancaCasino = 0;
                } else {
                    System.out.println("Qué pena, has perdido.");
                    bancaCasino += bancaJugador;
                    bancaJugador = 0;
                }
            } else {
                System.out.println("De acuerdo, quizás en otra ocasión.");
            }
        }

        System.out.println("Fin del juego. Tu banca final es " + bancaJugador + " y la banca del casino es " + bancaCasino);
    }
}

