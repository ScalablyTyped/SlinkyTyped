package typingsSlinky.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "transformer")
@js.native
object transformer extends js.Object {
  
  def apply[TResult, TInput](reducer: Reducer[TResult, TInput]): Transformer_[TResult, TInput] = js.native
}
