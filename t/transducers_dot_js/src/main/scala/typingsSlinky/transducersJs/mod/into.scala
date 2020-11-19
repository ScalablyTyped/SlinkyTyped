package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "into")
@js.native
object into extends js.Object {
  
  def apply[TInput](to: String, xf: Transducer[TInput, String], from: js.Iterable[TInput]): String = js.native
  def apply[TInput, TOutput](to: js.Array[TOutput], xf: Transducer[TInput, TOutput], from: js.Iterable[TInput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](
    to: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    from: js.Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
}
