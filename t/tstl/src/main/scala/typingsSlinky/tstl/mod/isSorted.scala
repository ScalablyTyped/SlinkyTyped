package typingsSlinky.tstl.mod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "is_sorted")
@js.native
object isSorted extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Boolean = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: Comparator[ValueType[InputIterator], ValueType[InputIterator]]
  ): Boolean = js.native
}
