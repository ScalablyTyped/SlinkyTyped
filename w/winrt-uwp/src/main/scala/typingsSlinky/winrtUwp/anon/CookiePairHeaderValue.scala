package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookiePairHeaderValue extends js.Object {
  /** The HttpCookiePairHeaderValue version of the string. */ var cookiePairHeaderValue: HttpCookiePairHeaderValue = js.native
  /** true if input is valid HttpCookiePairHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object CookiePairHeaderValue {
  @scala.inline
  def apply(cookiePairHeaderValue: HttpCookiePairHeaderValue, returnValue: Boolean): CookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(cookiePairHeaderValue = cookiePairHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiePairHeaderValue]
  }
  @scala.inline
  implicit class CookiePairHeaderValueOps[Self <: CookiePairHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookiePairHeaderValue(value: HttpCookiePairHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePairHeaderValue")(value.asInstanceOf[js.Any])
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

