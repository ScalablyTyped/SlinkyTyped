package typingsSlinky.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRequestDeviceFilter extends js.Object {
  var manufacturerId: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namePrefix: js.UndefOr[String] = js.native
  var serviceDataUUID: js.UndefOr[BluetoothServiceUUID] = js.native
  var services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}

object BluetoothRequestDeviceFilter {
  @scala.inline
  def apply(): BluetoothRequestDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothRequestDeviceFilter]
  }
  @scala.inline
  implicit class BluetoothRequestDeviceFilterOps[Self <: BluetoothRequestDeviceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManufacturerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceDataUUID(value: BluetoothServiceUUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDataUUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDataUUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDataUUID")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[BluetoothServiceUUID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

