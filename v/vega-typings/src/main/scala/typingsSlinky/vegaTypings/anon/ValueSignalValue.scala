package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.signalMod.SignalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueSignalValue extends _Update {
  
  var value: SignalValue = js.native
}
object ValueSignalValue {
  
  @scala.inline
  def apply(value: SignalValue): ValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSignalValue]
  }
  
  @scala.inline
  implicit class ValueSignalValueMutableBuilder[Self <: ValueSignalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
