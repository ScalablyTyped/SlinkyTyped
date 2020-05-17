package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the manufacturer for the current device. */
@js.native
trait StoreHardwareManufacturerInfo extends js.Object {
  /** Gets the hardware manufacture ID for the current device. */
  var hardwareManufacturerId: String = js.native
  /** Gets the name of the hardware manufacturer for the current device. */
  var manufacturerName: String = js.native
  /** Gets the model name for the current device. */
  var modelName: String = js.native
  /** Gets the ID of the Windows Store content modifier. */
  var storeContentModifierId: String = js.native
}

object StoreHardwareManufacturerInfo {
  @scala.inline
  def apply(
    hardwareManufacturerId: String,
    manufacturerName: String,
    modelName: String,
    storeContentModifierId: String
  ): StoreHardwareManufacturerInfo = {
    val __obj = js.Dynamic.literal(hardwareManufacturerId = hardwareManufacturerId.asInstanceOf[js.Any], manufacturerName = manufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], storeContentModifierId = storeContentModifierId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreHardwareManufacturerInfo]
  }
  @scala.inline
  implicit class StoreHardwareManufacturerInfoOps[Self <: StoreHardwareManufacturerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHardwareManufacturerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareManufacturerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreContentModifierId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeContentModifierId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

