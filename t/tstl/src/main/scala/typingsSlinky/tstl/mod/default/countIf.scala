package typingsSlinky.tstl.mod.default

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "count_if")
@js.native
object countIf extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): Double = js.native
}
