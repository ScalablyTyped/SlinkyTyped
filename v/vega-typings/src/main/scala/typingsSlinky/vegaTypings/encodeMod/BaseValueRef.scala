package typingsSlinky.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.anon.Value[T]
  - typingsSlinky.vegaTypings.anon.Field
*/
trait BaseValueRef[T] extends ScaledValueRef[T]
object BaseValueRef {
  
  @scala.inline
  def Field(field: typingsSlinky.vegaTypings.encodeMod.Field): typingsSlinky.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Field]
  }
  
  @scala.inline
  def SignalRef(signal: String): typingsSlinky.vegaTypings.signalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.SignalRef]
  }
  
  @scala.inline
  def Value[T](): typingsSlinky.vegaTypings.anon.Value[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Value[T]]
  }
}
