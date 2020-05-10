package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateOrDeltaHeaderValue extends js.Object {
  /** The HttpDateOrDeltaHeaderValue version of the string. */ var dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue = js.native
  /** true if input is valid HttpDateOrDeltaHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonDateOrDeltaHeaderValue {
  @scala.inline
  def apply(dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue, returnValue: Boolean): AnonDateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(dateOrDeltaHeaderValue = dateOrDeltaHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateOrDeltaHeaderValue]
  }
  @scala.inline
  implicit class AnonDateOrDeltaHeaderValueOps[Self <: AnonDateOrDeltaHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateOrDeltaHeaderValue(value: HttpDateOrDeltaHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOrDeltaHeaderValue")(value.asInstanceOf[js.Any])
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

