package typingsSlinky.tstl.mod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "remove_copy")
@js.native
object removeCopy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: ValueType[InputIterator]): OutputIterator = js.native
}

