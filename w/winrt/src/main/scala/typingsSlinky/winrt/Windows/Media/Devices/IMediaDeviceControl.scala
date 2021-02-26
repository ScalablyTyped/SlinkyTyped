package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.anon.SucceededBoolean
import typingsSlinky.winrt.anon.SucceededValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaDeviceControl extends StObject {
  
  var capabilities: MediaDeviceControlCapabilities = js.native
  
  def tryGetAuto(): SucceededBoolean = js.native
  
  def tryGetValue(): SucceededValue = js.native
  
  def trySetAuto(value: Boolean): Boolean = js.native
  
  def trySetValue(value: Double): Boolean = js.native
}
object IMediaDeviceControl {
  
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => SucceededBoolean,
    tryGetValue: () => SucceededValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[IMediaDeviceControl]
  }
  
  @scala.inline
  implicit class IMediaDeviceControlMutableBuilder[Self <: IMediaDeviceControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: MediaDeviceControlCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetAuto(value: () => SucceededBoolean): Self = StObject.set(x, "tryGetAuto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTryGetValue(value: () => SucceededValue): Self = StObject.set(x, "tryGetValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrySetAuto(value: Boolean => Boolean): Self = StObject.set(x, "trySetAuto", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrySetValue(value: Double => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
  }
}
