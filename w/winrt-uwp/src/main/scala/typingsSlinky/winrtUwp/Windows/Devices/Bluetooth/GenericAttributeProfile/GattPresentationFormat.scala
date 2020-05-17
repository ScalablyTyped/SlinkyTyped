package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of a single Presentation Format GATT Descriptor. */
@js.native
trait GattPresentationFormat extends js.Object {
  /** Gets the Description of the GattPresentationFormat object. */
  var description: Double = js.native
  /** Gets the Exponent of the GattPresentationFormat object. */
  var exponent: Double = js.native
  /** Gets the Format Type of the GattPresentationFormat object. */
  var formatType: Double = js.native
  /** Gets the Namespace of the GattPresentationFormat object. */
  var namespace: Double = js.native
  /** Gets the Unit of the GattPresentationFormat object. */
  var unit: Double = js.native
}

object GattPresentationFormat {
  @scala.inline
  def apply(description: Double, exponent: Double, formatType: Double, namespace: Double, unit: Double): GattPresentationFormat = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattPresentationFormat]
  }
  @scala.inline
  implicit class GattPresentationFormatOps[Self <: GattPresentationFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

