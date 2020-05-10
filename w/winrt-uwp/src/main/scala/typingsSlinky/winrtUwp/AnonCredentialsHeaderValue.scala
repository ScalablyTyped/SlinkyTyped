package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCredentialsHeaderValue extends js.Object {
  /** The HttpCredentialsHeaderValue version of the string. */ var credentialsHeaderValue: HttpCredentialsHeaderValue = js.native
  /** true if input is valid HttpCredentialsHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object AnonCredentialsHeaderValue {
  @scala.inline
  def apply(credentialsHeaderValue: HttpCredentialsHeaderValue, returnValue: Boolean): AnonCredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(credentialsHeaderValue = credentialsHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCredentialsHeaderValue]
  }
  @scala.inline
  implicit class AnonCredentialsHeaderValueOps[Self <: AnonCredentialsHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentialsHeaderValue(value: HttpCredentialsHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsHeaderValue")(value.asInstanceOf[js.Any])
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

