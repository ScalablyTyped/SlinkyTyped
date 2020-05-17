package typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container]]
  - typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer[
typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator[
  typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container], 
  js.Any
]]
*/
trait SimilarType[Container /* <: js.Array[_] | typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer[_] */] extends js.Object

object SimilarType {
  @scala.inline
  implicit def apply[Container](value: js.Array[ValueType[Container]]): SimilarType[Container] = value.asInstanceOf[SimilarType[Container]]
  @scala.inline
  implicit def apply[Container](
    value: typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer[IForwardIterator[ValueType[Container], js.Any]]
  ): SimilarType[Container] = value.asInstanceOf[SimilarType[Container]]
}

