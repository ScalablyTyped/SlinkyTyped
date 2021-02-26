package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICameraSettingsActivatedEventArgs extends IActivatedEventArgs {
  
  var videoDeviceController: js.Any = js.native
  
  var videoDeviceExtension: js.Any = js.native
}
object ICameraSettingsActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    videoDeviceController: js.Any,
    videoDeviceExtension: js.Any
  ): ICameraSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], videoDeviceController = videoDeviceController.asInstanceOf[js.Any], videoDeviceExtension = videoDeviceExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraSettingsActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ICameraSettingsActivatedEventArgsMutableBuilder[Self <: ICameraSettingsActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoDeviceController(value: js.Any): Self = StObject.set(x, "videoDeviceController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceExtension(value: js.Any): Self = StObject.set(x, "videoDeviceExtension", value.asInstanceOf[js.Any])
  }
}
