package typingsSlinky.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents zoom settings that can be applied to the ZoomControl by calling the Configure method. */
@js.native
trait ZoomSettings extends StObject {
  
  /** Gets or sets a ZoomTransitionMode value indicating how the capture device should transition to the new zoom value specified with the Value property. */
  var mode: ZoomTransitionMode = js.native
  
  /** Gets or sets the zoom value to which the ZoomControl will transition. */
  var value: Double = js.native
}
object ZoomSettings {
  
  @scala.inline
  def apply(mode: ZoomTransitionMode, value: Double): ZoomSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
  
  @scala.inline
  implicit class ZoomSettingsMutableBuilder[Self <: ZoomSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: ZoomTransitionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
