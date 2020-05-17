package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@js.native
trait HttpCookiePairHeaderValue extends js.Object {
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  var name: String = js.native
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  var value: String = js.native
}

object HttpCookiePairHeaderValue {
  @scala.inline
  def apply(name: String, value: String): HttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookiePairHeaderValue]
  }
  @scala.inline
  implicit class HttpCookiePairHeaderValueOps[Self <: HttpCookiePairHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

