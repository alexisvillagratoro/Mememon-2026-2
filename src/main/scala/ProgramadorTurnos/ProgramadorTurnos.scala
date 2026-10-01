package cl.uchile.dcc
package ProgramadorTurnos
import scala.collection.mutable.ListBuffer
import cl.uchile.dcc.ProgramadorTurnos.Unidad

// Consideraremos como unidad tanto a Jugador como a Enemigo
// Unidad no se puede modificar desde afuera, sino seria trampa

class ProgramadorTurnos {private val unidades: ListBuffer[Unidad] = ListBuffer.empty[Unidad]

  def agregarUnidad(unidad: Unidad): Unit=
    unidades += unidad

  def quitarUnidad(unidad: Unidad): Unit =
    unidades -= unidad

  def reiniciarBarra(unidad: Unidad): Unit =
    unidad.reiniciarBarra()
    
  def aumentarBarras(cantidad: Int): Unit =
    var i = 0
    
    while i < unidades.length do {
      unidades(i).aumentarBarra(cantidad)
      i += 1
    }


}

