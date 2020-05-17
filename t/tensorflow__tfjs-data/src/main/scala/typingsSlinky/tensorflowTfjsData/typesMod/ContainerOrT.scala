package typingsSlinky.tensorflowTfjsData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsData.typesMod.Container[T]
  - T
*/
trait ContainerOrT[T] extends js.Object

object ContainerOrT {
  @scala.inline
  implicit def apply[T](value: Container[T]): ContainerOrT[T] = value.asInstanceOf[ContainerOrT[T]]
  @scala.inline
  implicit def apply[T](value: T): ContainerOrT[T] = value.asInstanceOf[ContainerOrT[T]]
}

