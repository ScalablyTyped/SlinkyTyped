package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "toIter")
@js.native
object toIter extends js.Object {
  
  def apply[TInput, TOutput](coll: StringDictionary[TInput]): IterableIterator[TOutput] = js.native
  def apply[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): IterableIterator[TOutput] = js.native
  def apply[TInput, TOutput](coll: js.Iterable[TInput]): IterableIterator[TOutput] = js.native
  def apply[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
}
