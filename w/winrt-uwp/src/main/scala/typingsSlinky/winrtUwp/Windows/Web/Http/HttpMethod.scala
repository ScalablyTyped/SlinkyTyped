package typingsSlinky.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
@js.native
trait HttpMethod extends js.Object {
  /** Gets the HTTP method. */
  var method: String = js.native
}

object HttpMethod {
  @scala.inline
  def apply(method: String): HttpMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMethod]
  }
  @scala.inline
  implicit class HttpMethodOps[Self <: HttpMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

