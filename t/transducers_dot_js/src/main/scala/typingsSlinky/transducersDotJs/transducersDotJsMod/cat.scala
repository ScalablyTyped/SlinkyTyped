package typingsSlinky.transducersDotJs.transducersDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "cat")
@js.native
object cat extends js.Object {
  def apply[TResult, TInput](f: Transformer[TResult, TInput]): Transformer[TResult, js.Iterable[TInput]] = js.native
}

