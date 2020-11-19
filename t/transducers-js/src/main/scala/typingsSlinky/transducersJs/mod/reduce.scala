package typingsSlinky.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "reduce")
@js.native
object reduce extends js.Object {
  
  def apply[TResult, TInput](xf: Reducer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  def apply[TResult, TInput](xf: Reducer[TResult, TInput], init: TResult, coll: js.Iterable[TInput]): TResult = js.native
  def apply[TResult, TInput](xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  def apply[TResult, TInput](xf: Transformer[TResult, TInput], init: TResult, coll: js.Iterable[TInput]): TResult = js.native
}
