package typingsSlinky.tstl.mod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "max_element")
@js.native
object maxElement extends js.Object {
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
}

