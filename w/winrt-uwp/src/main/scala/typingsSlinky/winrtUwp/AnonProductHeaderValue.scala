package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProductHeaderValue extends js.Object {
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: HttpProductHeaderValue = js.native
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonProductHeaderValue {
  @scala.inline
  def apply(productHeaderValue: HttpProductHeaderValue, returnValue: Boolean): AnonProductHeaderValue = {
    val __obj = js.Dynamic.literal(productHeaderValue = productHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProductHeaderValue]
  }
  @scala.inline
  implicit class AnonProductHeaderValueOps[Self <: AnonProductHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductHeaderValue(value: HttpProductHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productHeaderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

