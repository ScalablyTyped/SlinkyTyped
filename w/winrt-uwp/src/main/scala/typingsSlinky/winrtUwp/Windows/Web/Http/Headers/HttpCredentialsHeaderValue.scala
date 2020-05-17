package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
@js.native
trait HttpCredentialsHeaderValue extends js.Object {
  /** Gets a set of name/value pairs included in the Authorization or Proxy-Authorization HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Gets the scheme to use for authentication. */
  var scheme: String = js.native
  /** Gets the user token information used in the Authorization or Proxy-Authorization HTTP header. */
  var token: String = js.native
}

object HttpCredentialsHeaderValue {
  @scala.inline
  def apply(parameters: IVector[HttpNameValueHeaderValue], scheme: String, token: String): HttpCredentialsHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCredentialsHeaderValue]
  }
  @scala.inline
  implicit class HttpCredentialsHeaderValueOps[Self <: HttpCredentialsHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: IVector[HttpNameValueHeaderValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

