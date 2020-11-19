package typingsSlinky.tstl.mod

import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "replace_if")
@js.native
object replaceIf extends js.Object {
  
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: UnaryPredicator[ValueType[InputIterator]],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
}
