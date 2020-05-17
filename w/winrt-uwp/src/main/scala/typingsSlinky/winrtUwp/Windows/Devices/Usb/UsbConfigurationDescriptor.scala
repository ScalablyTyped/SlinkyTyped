package typingsSlinky.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Derives information from the first 9 bytes of a USB configuration descriptor. The information includes the power capabilities of the device when the configuration is active and the number of interfaces included in that configuration. For an explanation of a configuration descriptor, Section 9.6.3 Universal Serial Bus Specification. For information about descriptor fields, see: */
@js.native
trait UsbConfigurationDescriptor extends js.Object {
  /** Gets the bConfigurationValue field of a USB configuration descriptor. The value is the number that identifies the configuration. */
  var configurationValue: Double = js.native
  /** Gets the bMaxPower field of a USB configuration descriptor. The value indicates the maximum power (in milliamp units) that the device can draw from the bus, when the device is bus-powered. */
  var maxPowerMilliamps: Double = js.native
  /** Gets the D5 bit value of the bmAttributes field in the USB configuration descriptor. The value indicates whether the device can send a resume signal to wake up itself or the host system from a low power state. */
  var remoteWakeup: Boolean = js.native
  /** Gets the D6 bit of the bmAttributes field in the USB configuration. This value indicates whether the device is drawing power from a local source or the bus. */
  var selfPowered: Boolean = js.native
}

object UsbConfigurationDescriptor {
  @scala.inline
  def apply(configurationValue: Double, maxPowerMilliamps: Double, remoteWakeup: Boolean, selfPowered: Boolean): UsbConfigurationDescriptor = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], maxPowerMilliamps = maxPowerMilliamps.asInstanceOf[js.Any], remoteWakeup = remoteWakeup.asInstanceOf[js.Any], selfPowered = selfPowered.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbConfigurationDescriptor]
  }
  @scala.inline
  implicit class UsbConfigurationDescriptorOps[Self <: UsbConfigurationDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPowerMilliamps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPowerMilliamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteWakeup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteWakeup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfPowered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfPowered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

