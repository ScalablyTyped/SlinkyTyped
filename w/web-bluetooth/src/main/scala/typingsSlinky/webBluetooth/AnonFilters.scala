package typingsSlinky.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilters extends RequestDeviceOptions {
  var filters: js.Array[BluetoothRequestDeviceFilter] = js.native
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}

object AnonFilters {
  @scala.inline
  def apply(filters: js.Array[BluetoothRequestDeviceFilter]): AnonFilters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters]
  }
  @scala.inline
  implicit class AnonFiltersOps[Self <: AnonFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[BluetoothRequestDeviceFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalServices")(js.undefined)
        ret
    }
  }
  
}

