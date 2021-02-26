package typingsSlinky.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccelerometerShakenEventArgs extends StObject {
  
  var timestamp: js.Date = js.native
}
object IAccelerometerShakenEventArgs {
  
  @scala.inline
  def apply(timestamp: js.Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
  
  @scala.inline
  implicit class IAccelerometerShakenEventArgsMutableBuilder[Self <: IAccelerometerShakenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
