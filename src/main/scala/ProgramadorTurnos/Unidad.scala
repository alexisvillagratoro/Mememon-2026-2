package cl.uchile.dcc
package ProgramadorTurnos

// Hay que juntar Jugador y Enemigo en Unidad.
trait Unidad:
      val peso: Int
      var barraDeAccion: Int = 0

      def reiniciarBarra(): Unit =
        barraDeAccion = 0

      def aumentarBarra(cantidad: Int): Unit =
        barraDeAccion += cantidad

