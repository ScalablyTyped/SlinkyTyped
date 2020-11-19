package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.modifiersMod.BinaryOperatorInferrer
import typingsSlinky.tstl.modifiersMod.UnaryOperatorInferrer
import typingsSlinky.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "transform")
@js.native
object transform extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: UnaryOperatorInferrer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
  def apply[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    op: BinaryOperatorInferrer[InputIterator1, InputIterator2, OutputIterator]
  ): OutputIterator = js.native
}
