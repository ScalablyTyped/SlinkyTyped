package typingsSlinky.tensorflowTfjsData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsData.typesMod.ContainerObject[T]
  - typingsSlinky.tensorflowTfjsData.typesMod.ContainerArray[T]
*/
trait Container[T] extends ContainerOrT[T]

object Container {
  @scala.inline
  implicit def apply[T](value: ContainerArray[T]): Container[T] = value.asInstanceOf[Container[T]]
  @scala.inline
  implicit def apply[T](value: ContainerObject[T]): Container[T] = value.asInstanceOf[Container[T]]
}

