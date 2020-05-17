package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectationHeaderValue extends js.Object {
  /** The HttpExpectationHeaderValue version of the string. */ var expectationHeaderValue: HttpExpectationHeaderValue = js.native
  /** true if input is valid HttpExpectationHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ExpectationHeaderValue {
  @scala.inline
  def apply(expectationHeaderValue: HttpExpectationHeaderValue, returnValue: Boolean): ExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(expectationHeaderValue = expectationHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationHeaderValue]
  }
  @scala.inline
  implicit class ExpectationHeaderValueOps[Self <: ExpectationHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectationHeaderValue(value: HttpExpectationHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectationHeaderValue")(value.asInstanceOf[js.Any])
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

