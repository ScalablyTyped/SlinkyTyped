package typingsSlinky.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
@js.native
trait I2cConnectionSettings extends js.Object {
  /** Gets or sets the bus speed to use for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  var busSpeed: I2cBusSpeed = js.native
  /** Gets or sets the sharing mode to use to connect to the inter-integrated circuit (I²C) bus address. This mode determines whether other connections to the I²C bus address can be opened while you are connect to the I²C bus address. */
  var sharingMode: I2cSharingMode = js.native
  /** Gets or sets the bus address of the inter-integrated circuit (I²C) device. */
  var slaveAddress: Double = js.native
}

object I2cConnectionSettings {
  @scala.inline
  def apply(busSpeed: I2cBusSpeed, sharingMode: I2cSharingMode, slaveAddress: Double): I2cConnectionSettings = {
    val __obj = js.Dynamic.literal(busSpeed = busSpeed.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any], slaveAddress = slaveAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2cConnectionSettings]
  }
  @scala.inline
  implicit class I2cConnectionSettingsOps[Self <: I2cConnectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusSpeed(value: I2cBusSpeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharingMode(value: I2cSharingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlaveAddress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slaveAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

