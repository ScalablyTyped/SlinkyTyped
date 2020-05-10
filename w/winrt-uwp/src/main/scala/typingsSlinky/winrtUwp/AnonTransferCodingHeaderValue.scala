package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransferCodingHeaderValue extends js.Object {
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: HttpTransferCodingHeaderValue = js.native
}

object AnonTransferCodingHeaderValue {
  @scala.inline
  def apply(returnValue: Boolean, transferCodingHeaderValue: HttpTransferCodingHeaderValue): AnonTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], transferCodingHeaderValue = transferCodingHeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransferCodingHeaderValue]
  }
  @scala.inline
  implicit class AnonTransferCodingHeaderValueOps[Self <: AnonTransferCodingHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferCodingHeaderValue(value: HttpTransferCodingHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferCodingHeaderValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

