package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "all_of")
@js.native
object all_of extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
}

