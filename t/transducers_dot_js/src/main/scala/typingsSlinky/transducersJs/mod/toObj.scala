package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "toObj")
@js.native
object toObj extends js.Object {
  
  def apply[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = js.native
  def apply[TInput, TOutput](coll: js.Iterable[TInput]): StringDictionary[TOutput] = js.native
  def apply[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, js.Tuple2[String, TOutput]]): StringDictionary[TOutput] = js.native
}
