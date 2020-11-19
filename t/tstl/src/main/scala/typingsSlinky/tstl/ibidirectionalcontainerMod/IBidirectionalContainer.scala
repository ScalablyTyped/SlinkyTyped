package typingsSlinky.tstl.ibidirectionalcontainerMod

import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.ireversableiteratorMod.IReversableIterator
import typingsSlinky.tstl.ireverseiteratorMod.IReverseIterator
import typingsSlinky.tstl.vectorMod.Vector.Iterator
import typingsSlinky.tstl.vectorMod.Vector.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBidirectionalContainer[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */] extends IForwardContainer[IteratorT] {
  
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  def rbegin(): ReverseIteratorT = js.native
  
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  def rend(): ReverseIteratorT = js.native
}
@JSImport("tstl/ranges/container/IBidirectionalContainer", "IBidirectionalContainer")
@js.native
object IBidirectionalContainer extends js.Object {
  
  /**
    * Deduct iterator type.
    */
  type IteratorType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = js.Any | Iterator[js.Any]
  
  /**
    * Deduct reverse iterator type.
    */
  type ReverseIteratorType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = js.Any | ReverseIterator[js.Any]
  
  /**
    * Deduct value type.
    */
  type ValueType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = typingsSlinky.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}
