package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ICameraSettingsActivatedEventArgsOps[Self <: ICameraSettingsActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoDeviceController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDeviceController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoDeviceExtension(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDeviceExtension")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

