package typingsSlinky.tstl.mod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "partial_sort_copy")
@js.native
object partialSortCopy extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: General[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: OutputIterator,
    output_last: OutputIterator
  ): OutputIterator = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: General[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: OutputIterator,
    output_last: OutputIterator,
    comp: Comparator[ValueType[InputIterator], ValueType[InputIterator]]
  ): OutputIterator = js.native
}
