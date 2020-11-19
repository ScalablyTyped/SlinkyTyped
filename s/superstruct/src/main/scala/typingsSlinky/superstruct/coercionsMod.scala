package typingsSlinky.superstruct

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.superstructBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/coercions", JSImport.Namespace)
@js.native
object coercionsMod extends js.Object {
  
  def coercion[T](struct: Struct[T, _], coercer: js.Function1[/* value */ js.Any, _]): Struct[T, _] = js.native
  
  def defaulted[T](S: Struct[T, _], fallback: js.Any): Struct[T, _] = js.native
  @JSName("defaulted")
  def defaulted_true[T](S: Struct[T, _], fallback: js.Any, strict: `true`): Struct[T, _] = js.native
  
  def masked[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct[_, _]] */](S: Struct[T, V]): Struct[T, _] = js.native
}
