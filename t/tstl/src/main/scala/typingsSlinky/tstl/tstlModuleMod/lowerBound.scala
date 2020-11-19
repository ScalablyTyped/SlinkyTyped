package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "lower_bound")
@js.native
object lowerBound extends js.Object {
  
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
}
