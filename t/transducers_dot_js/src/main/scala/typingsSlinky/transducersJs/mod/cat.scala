package typingsSlinky.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "cat")
@js.native
object cat extends js.Object {
  def apply[TResult, TInput](f: Transformer_[TResult, TInput]): Transformer_[TResult, js.Iterable[TInput]] = js.native
}

