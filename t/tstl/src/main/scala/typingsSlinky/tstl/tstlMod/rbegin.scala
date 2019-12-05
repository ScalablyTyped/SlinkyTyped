package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer
import typingsSlinky.tstl.containerVectorMod.Vector.ReverseIterator
import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typingsSlinky.tstl.iteratorIReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "rbegin")
@js.native
object rbegin extends js.Object {
  def apply[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def apply[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
}

