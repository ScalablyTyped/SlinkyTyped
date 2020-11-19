package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.binaryPredicatorMod.BinaryPredicator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "search_n")
@js.native
object searchN extends js.Object {
  
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, count: Double, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: Double,
    `val`: ValueType[ForwardIterator],
    pred: BinaryPredicator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
}
