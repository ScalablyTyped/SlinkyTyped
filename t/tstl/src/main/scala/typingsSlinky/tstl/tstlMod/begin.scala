package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.baseDisposableIForwardContainerMod.IForwardContainer
import typingsSlinky.tstl.containerVectorMod.Vector.Iterator
import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "begin")
@js.native
object begin extends js.Object {
  def apply[T](container: js.Array[T]): Iterator[T] = js.native
  def apply[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
}

