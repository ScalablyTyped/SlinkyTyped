package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth LE device that caused this trigger to fire. */
@js.native
trait GattCharacteristicNotificationTriggerDetails extends js.Object {
  /** Gets the GATT characteristic that changed. */
  var characteristic: GattCharacteristic = js.native
  /** Gets a byte stream containing the new value of the characteristic. */
  var value: IBuffer = js.native
}

object GattCharacteristicNotificationTriggerDetails {
  @scala.inline
  def apply(characteristic: GattCharacteristic, value: IBuffer): GattCharacteristicNotificationTriggerDetails = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattCharacteristicNotificationTriggerDetails]
  }
  @scala.inline
  implicit class GattCharacteristicNotificationTriggerDetailsOps[Self <: GattCharacteristicNotificationTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristic(value: GattCharacteristic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

