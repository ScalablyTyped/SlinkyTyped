package typingsSlinky.tstl.mod

import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "stable_partition")
@js.native
object stablePartition extends js.Object {
  
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: UnaryPredicator[ValueType[BidirectionalIterator]]
  ): BidirectionalIterator = js.native
}
