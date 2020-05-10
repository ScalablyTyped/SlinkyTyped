package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "seq")
@js.native
object seq extends js.Object {
  def apply[TInput, TOutput](coll: js.Array[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = js.native
  def apply[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
}

