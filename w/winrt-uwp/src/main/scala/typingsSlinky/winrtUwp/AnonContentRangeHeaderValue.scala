package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentRangeHeaderValue extends js.Object {
  /** The HttpContentRangeHeaderValue version of the string. */ var contentRangeHeaderValue: HttpContentRangeHeaderValue = js.native
  /** true if input is valid HttpContentRangeHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonContentRangeHeaderValue {
  @scala.inline
  def apply(contentRangeHeaderValue: HttpContentRangeHeaderValue, returnValue: Boolean): AnonContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(contentRangeHeaderValue = contentRangeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentRangeHeaderValue]
  }
  @scala.inline
  implicit class AnonContentRangeHeaderValueOps[Self <: AnonContentRangeHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentRangeHeaderValue(value: HttpContentRangeHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRangeHeaderValue")(value.asInstanceOf[js.Any])
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

