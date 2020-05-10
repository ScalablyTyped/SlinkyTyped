package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.AnonSucceededBoolean
import typingsSlinky.winrt.AnonSucceededValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaDeviceControl extends js.Object {
  var capabilities: MediaDeviceControlCapabilities = js.native
  def tryGetAuto(): AnonSucceededBoolean = js.native
  def tryGetValue(): AnonSucceededValue = js.native
  def trySetAuto(value: Boolean): Boolean = js.native
  def trySetValue(value: Double): Boolean = js.native
}

object IMediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => AnonSucceededBoolean,
    tryGetValue: () => AnonSucceededValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): IMediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[IMediaDeviceControl]
  }
  @scala.inline
  implicit class IMediaDeviceControlOps[Self <: IMediaDeviceControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: MediaDeviceControlCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetAuto(value: () => AnonSucceededBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetAuto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryGetValue(value: () => AnonSucceededValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrySetAuto(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetAuto")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrySetValue(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

