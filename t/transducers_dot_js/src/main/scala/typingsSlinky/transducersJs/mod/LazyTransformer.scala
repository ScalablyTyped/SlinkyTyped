package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "LazyTransformer")
@js.native
class LazyTransformer[TInput, TOutput] protected () extends IterableIterator[TOutput] {
  def this(xf: Transducer[TInput, TOutput], coll: js.Iterable[TInput]) = this()
}

@JSImport("transducers.js", "LazyTransformer")
@js.native
object LazyTransformer extends TopLevel[LazyTransformerConstructor]

