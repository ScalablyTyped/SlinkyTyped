package typingsSlinky.w3cGenericSensor

import typingsSlinky.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensorErrorEventInit extends EventInit {
  
  var error: js.Error = js.native
}
object SensorErrorEventInit {
  
  @scala.inline
  def apply(error: js.Error): SensorErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorErrorEventInit]
  }
  
  @scala.inline
  implicit class SensorErrorEventInitMutableBuilder[Self <: SensorErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
