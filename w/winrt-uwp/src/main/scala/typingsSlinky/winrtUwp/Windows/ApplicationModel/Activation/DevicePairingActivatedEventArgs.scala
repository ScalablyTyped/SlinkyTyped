package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePairingActivatedEventArgs extends js.Object {
  var deviceInformation: js.Any = js.native
   /* unmapped type */ var kind: js.Any = js.native
   /* unmapped type */ var previousExecutionState: js.Any = js.native
   /* unmapped type */ var splashScreen: js.Any = js.native
}

object DevicePairingActivatedEventArgs {
  @scala.inline
  def apply(deviceInformation: js.Any, kind: js.Any, previousExecutionState: js.Any, splashScreen: js.Any): DevicePairingActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformation = deviceInformation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePairingActivatedEventArgs]
  }
  @scala.inline
  implicit class DevicePairingActivatedEventArgsOps[Self <: DevicePairingActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceInformation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousExecutionState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousExecutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplashScreen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashScreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

