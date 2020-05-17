package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents name and value information used in a number of HTTP headers. */
@js.native
trait HttpNameValueHeaderValue extends js.Object {
  /** Gets the name used in the HttpNameValueHeaderValue object. */
  var name: String = js.native
  /** Gets or sets the value associated with a name used in the HttpNameValueHeaderValue object. */
  var value: String = js.native
}

object HttpNameValueHeaderValue {
  @scala.inline
  def apply(name: String, value: String): HttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpNameValueHeaderValue]
  }
  @scala.inline
  implicit class HttpNameValueHeaderValueOps[Self <: HttpNameValueHeaderValue] (val x: Self) extends AnyVal {
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

