package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.iteratorIFakeMod.Writeonly
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "reverse_copy")
@js.native
object reverse_copy extends js.Object {
  def apply[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[BidirectionalIterator], OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
}

