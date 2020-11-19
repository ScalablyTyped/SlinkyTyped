package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "transduce")
@js.native
object transduce extends js.Object {
  
  def apply[TResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TResult = js.native
  def apply[TResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: js.Iterable[TInput]
  ): TResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: js.Iterable[TInput]
  ): TCompleteResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: js.Iterable[TInput]
  ): TCompleteResult = js.native
}
