package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@js.native
trait BluetoothLEAppearance extends js.Object {
  /** Gets the appearance category value of the Bluetooth LE device. */
  var category: Double = js.native
  /** Gets the appearance raw value of the Bluetooth LE device. */
  var rawValue: Double = js.native
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  var subCategory: Double = js.native
}

object BluetoothLEAppearance {
  @scala.inline
  def apply(category: Double, rawValue: Double, subCategory: Double): BluetoothLEAppearance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], subCategory = subCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAppearance]
  }
  @scala.inline
  implicit class BluetoothLEAppearanceOps[Self <: BluetoothLEAppearance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subCategory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

