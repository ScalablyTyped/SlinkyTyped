package typingsSlinky.tstl.mod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "is_partitioned")
@js.native
object isPartitioned extends js.Object {
  
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, pred: UnaryPredicator[ValueType[ForwardIterator]]): Boolean = js.native
}
