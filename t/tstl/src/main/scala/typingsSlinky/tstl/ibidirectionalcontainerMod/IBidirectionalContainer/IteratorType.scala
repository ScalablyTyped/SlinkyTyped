package typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer

import typingsSlinky.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - typingsSlinky.tstl.vectorMod.Vector.Iterator[js.Any]
*/
trait IteratorType[Container /* <: js.Array[_] | (typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer[_, _]) */] extends js.Object

object IteratorType {
  @scala.inline
  implicit def apply[Container](value: js.Any): IteratorType[Container] = value.asInstanceOf[IteratorType[Container]]
  @scala.inline
  implicit def apply[Container](value: Iterator[js.Any]): IteratorType[Container] = value.asInstanceOf[IteratorType[Container]]
}

