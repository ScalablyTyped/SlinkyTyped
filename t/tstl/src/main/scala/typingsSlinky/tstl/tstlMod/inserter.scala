package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.baseDisposableIPartialContainersMod._IInsert
import typingsSlinky.tstl.containerVectorMod.Vector.Iterator
import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inserter")
@js.native
object inserter extends js.Object {
  def apply[T](container: js.Array[T], it: Iterator[T]): typingsSlinky.tstl.iteratorInsertIteratorMod.InsertIterator[typingsSlinky.tstl.containerVectorMod.Vector[T], Iterator[T]] = js.native
  def apply[Container /* <: _IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typingsSlinky.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
}

