package typingsSlinky.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "mapcat")
@js.native
object mapcat extends js.Object {
  def apply[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, js.Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
}

