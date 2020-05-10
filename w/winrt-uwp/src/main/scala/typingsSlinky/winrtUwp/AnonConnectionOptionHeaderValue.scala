package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnectionOptionHeaderValue extends js.Object {
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: HttpConnectionOptionHeaderValue = js.native
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonConnectionOptionHeaderValue {
  @scala.inline
  def apply(connectionOptionHeaderValue: HttpConnectionOptionHeaderValue, returnValue: Boolean): AnonConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionOptionHeaderValue]
  }
  @scala.inline
  implicit class AnonConnectionOptionHeaderValueOps[Self <: AnonConnectionOptionHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionOptionHeaderValue(value: HttpConnectionOptionHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionOptionHeaderValue")(value.asInstanceOf[js.Any])
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

