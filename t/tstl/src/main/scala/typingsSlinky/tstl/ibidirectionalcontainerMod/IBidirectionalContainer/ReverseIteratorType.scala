package typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer

import typingsSlinky.tstl.vectorMod.Vector.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - typingsSlinky.tstl.vectorMod.Vector.ReverseIterator[js.Any]
*/
trait ReverseIteratorType[Container /* <: js.Array[_] | (typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer[_, _]) */] extends js.Object

object ReverseIteratorType {
  @scala.inline
  implicit def apply[Container](value: js.Any): ReverseIteratorType[Container] = value.asInstanceOf[ReverseIteratorType[Container]]
  @scala.inline
  implicit def apply[Container](value: ReverseIterator[js.Any]): ReverseIteratorType[Container] = value.asInstanceOf[ReverseIteratorType[Container]]
}

