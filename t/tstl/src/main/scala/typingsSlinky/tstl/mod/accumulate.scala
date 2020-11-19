package typingsSlinky.tstl.mod

import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.operationsMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "accumulate")
@js.native
object accumulate extends js.Object {
  
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, init: ValueType[InputIterator]): ValueType[InputIterator] = js.native
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    init: ValueType[InputIterator],
    op: Operator[InputIterator, InputIterator]
  ): ValueType[InputIterator] = js.native
}
