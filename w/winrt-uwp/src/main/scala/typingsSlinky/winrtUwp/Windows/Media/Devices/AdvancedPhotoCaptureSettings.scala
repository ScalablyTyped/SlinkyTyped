package typingsSlinky.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents settings for an AdvancedPhotoControl object. */
@js.native
trait AdvancedPhotoCaptureSettings extends StObject {
  
  /** Gets or sets the advanced capture mode for which an AdvancedPhotoControl will be configured. */
  var mode: AdvancedPhotoMode = js.native
}
object AdvancedPhotoCaptureSettings {
  
  @scala.inline
  def apply(mode: AdvancedPhotoMode): AdvancedPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedPhotoCaptureSettings]
  }
  
  @scala.inline
  implicit class AdvancedPhotoCaptureSettingsMutableBuilder[Self <: AdvancedPhotoCaptureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: AdvancedPhotoMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
