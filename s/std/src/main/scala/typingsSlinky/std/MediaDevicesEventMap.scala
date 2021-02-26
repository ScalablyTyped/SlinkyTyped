package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDevicesEventMap extends StObject {
  
  var devicechange: org.scalajs.dom.raw.Event = js.native
}
object MediaDevicesEventMap {
  
  @scala.inline
  def apply(devicechange: org.scalajs.dom.raw.Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  @scala.inline
  implicit class MediaDevicesEventMapMutableBuilder[Self <: MediaDevicesEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
