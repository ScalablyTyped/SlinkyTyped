package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.anon.ReturnValueValue
import typingsSlinky.winrtUwp.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets or sets a device setting on a camera. */
@js.native
trait MediaDeviceControl extends js.Object {
  /** Gets the capabilities of the camera for this camera setting. */
  var capabilities: MediaDeviceControlCapabilities = js.native
  /**
    * Indicates whether automatic adjustment of the camera setting is enabled.
    */
  def tryGetAuto(): Value = js.native
  /**
    * Gets the value of the camera setting.
    */
  def tryGetValue(): ReturnValueValue = js.native
  /**
    * Enables or disables automatic adjustment of the camera setting.
    * @param value True to enable automatic adjustment; or false to disable automatic adjustment. If false, call TrySetValue to adjust the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  def trySetAuto(value: Boolean): Boolean = js.native
  /**
    * Sets the camera setting.
    * @param value The new value of the camera setting. The units depend on the setting.
    * @return Returns true if the method succeeds, or false otherwise.
    */
  def trySetValue(value: Double): Boolean = js.native
}

object MediaDeviceControl {
  @scala.inline
  def apply(
    capabilities: MediaDeviceControlCapabilities,
    tryGetAuto: () => Value,
    tryGetValue: () => ReturnValueValue,
    trySetAuto: Boolean => Boolean,
    trySetValue: Double => Boolean
  ): MediaDeviceControl = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], tryGetAuto = js.Any.fromFunction0(tryGetAuto), tryGetValue = js.Any.fromFunction0(tryGetValue), trySetAuto = js.Any.fromFunction1(trySetAuto), trySetValue = js.Any.fromFunction1(trySetValue))
    __obj.asInstanceOf[MediaDeviceControl]
  }
  @scala.inline
  implicit class MediaDeviceControlOps[Self <: MediaDeviceControl] (val x: Self) extends AnyVal {
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
    def withTryGetAuto(value: () => Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetAuto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryGetValue(value: () => ReturnValueValue): Self = {
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

