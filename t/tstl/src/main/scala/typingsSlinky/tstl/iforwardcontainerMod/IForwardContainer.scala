package typingsSlinky.tstl.iforwardcontainerMod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.isizeMod.ISize
import typingsSlinky.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IForwardContainer[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends ISize {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  def begin(): Iterator = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  def end(): Iterator = js.native
}

@JSImport("tstl/ranges/container/IForwardContainer", "IForwardContainer")
@js.native
object IForwardContainer extends js.Object {
  type IteratorType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Any | Iterator[js.Any]
  type SimilarType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Array[typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container]] | (IForwardContainer[
    IForwardIterator[
      typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container], 
      js.Any
    ]
  ])
  type ValueType[Container /* <: js.Array[_] | IForwardContainer[_] */] = typingsSlinky.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}

