package typingsSlinky.tstl.mod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "prev_permutation")
@js.native
object prevPermutation extends js.Object {
  
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: Comparator[ValueType[BidirectionalIterator], ValueType[BidirectionalIterator]]
  ): Boolean = js.native
}
