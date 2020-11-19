package typingsSlinky.tstl

import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/ranges/algorithm/random", JSImport.Namespace)
@js.native
object algorithmRandomMod extends js.Object {
  
  def sample[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](range: Range, first: OutputIterator, n: Double): OutputIterator = js.native
}
