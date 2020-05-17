package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a token for a particular server behavior required by the client that is used in the Expect HTTP header on an HTTP request. */
@js.native
trait HttpExpectationHeaderValue extends js.Object {
  /** Gets or sets a token that represents a name for a server behavior used in the Expect HTTP header. */
  var name: String = js.native
  /** Gets a set of parameters for a server behavior included in the Expect HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets or sets a value for a server behavior used in the Expect HTTP header. */
  var value: String = js.native
}

object HttpExpectationHeaderValue {
  @scala.inline
  def apply(name: String, parameters: IVector[HttpNameValueHeaderValue], value: String): HttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpExpectationHeaderValue]
  }
  @scala.inline
  implicit class HttpExpectationHeaderValueOps[Self <: HttpExpectationHeaderValue] (val x: Self) extends AnyVal {
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
    def withParameters(value: IVector[HttpNameValueHeaderValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
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

