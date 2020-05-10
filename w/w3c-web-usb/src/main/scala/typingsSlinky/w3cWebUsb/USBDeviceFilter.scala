package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBDeviceFilter extends js.Object {
  var classCode: js.UndefOr[Double] = js.native
  var productId: js.UndefOr[Double] = js.native
  var protocolCode: js.UndefOr[Double] = js.native
  var serialNumber: js.UndefOr[String] = js.native
  var subclassCode: js.UndefOr[Double] = js.native
  var vendorId: js.UndefOr[Double] = js.native
}

object USBDeviceFilter {
  @scala.inline
  def apply(): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBDeviceFilter]
  }
  @scala.inline
  implicit class USBDeviceFilterOps[Self <: USBDeviceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classCode")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSubclassCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subclassCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubclassCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subclassCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(js.undefined)
        ret
    }
  }
  
}

