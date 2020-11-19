package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "is_sorted_until")
@js.native
object isSortedUntil extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: Comparator[ValueType[InputIterator], ValueType[InputIterator]]
  ): InputIterator = js.native
}
