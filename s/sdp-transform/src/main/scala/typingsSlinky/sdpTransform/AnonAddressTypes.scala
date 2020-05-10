package typingsSlinky.sdpTransform

import typingsSlinky.sdpTransform.sdpTransformStrings.excl
import typingsSlinky.sdpTransform.sdpTransformStrings.incl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddressTypes extends js.Object {
  var addressTypes: String = js.native
  var destAddress: String = js.native
  var filterMode: excl | incl = js.native
  var netType: String = js.native
  var srcList: String = js.native
}

object AnonAddressTypes {
  @scala.inline
  def apply(
    addressTypes: String,
    destAddress: String,
    filterMode: excl | incl,
    netType: String,
    srcList: String
  ): AnonAddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes.asInstanceOf[js.Any], destAddress = destAddress.asInstanceOf[js.Any], filterMode = filterMode.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], srcList = srcList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressTypes]
  }
  @scala.inline
  implicit class AnonAddressTypesOps[Self <: AnonAddressTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterMode(value: excl | incl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

