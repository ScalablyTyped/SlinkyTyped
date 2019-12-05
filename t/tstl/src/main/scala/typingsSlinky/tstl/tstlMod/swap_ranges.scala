package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIFakeMod.General
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "swap_ranges")
@js.native
object swap_ranges extends js.Object {
  def apply[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
}

