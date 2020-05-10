package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "into")
@js.native
object into extends js.Object {
  def apply[TInput](empty: String, xf: Transducer[js.Tuple2[String, TInput], String], coll: StringDictionary[TInput]): String = js.native
  def apply[TInput](empty: String, xf: Transducer[TInput, String], coll: js.Iterable[TInput]): String = js.native
  def apply[TInput, TOutput](
    empty: js.Array[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    coll: StringDictionary[TInput]
  ): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](empty: js.Array[TOutput], xf: Transducer[TInput, TOutput], coll: js.Iterable[TInput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]],
    coll: StringDictionary[TInput]
  ): StringDictionary[TOutput] = js.native
  def apply[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    coll: js.Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
}

