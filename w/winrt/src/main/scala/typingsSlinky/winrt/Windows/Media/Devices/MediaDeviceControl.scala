package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.anon.SucceededBoolean
import typingsSlinky.winrt.anon.SucceededValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDeviceControl extends IMediaDeviceControl
object MediaDeviceControl {
  
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => SucceededBoolean,
    tryGetValue: () => SucceededValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): MediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[MediaDeviceControl]
  }
}
