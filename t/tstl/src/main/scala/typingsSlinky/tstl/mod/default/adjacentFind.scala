package typingsSlinky.tstl.mod.default

import typingsSlinky.tstl.binaryPredicatorMod.BinaryPredicator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "adjacent_find")
@js.native
object adjacentFind extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: BinaryPredicator[ValueType[InputIterator], ValueType[InputIterator]]
  ): InputIterator = js.native
}
