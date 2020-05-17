package typingsSlinky.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a set of properties and methods to manage an HTTP cookie. */
@js.native
trait HttpCookie extends js.Object {
  /** Get the domain for which the HttpCookie is valid. */
  var domain: String = js.native
  /** Get or set the expiration date and time for the HttpCookie . */
  var expires: js.Date = js.native
  /** Get or set a value that controls whether a script or other active content can access this HttpCookie . */
  var httpOnly: Boolean = js.native
  /** Get the token that represents the HttpCookie name. */
  var name: String = js.native
  /** Get the URI path component to which the HttpCookie applies. */
  var path: String = js.native
  /** Get or set the security level for the HttpCookie . */
  var secure: Boolean = js.native
  /** Get or set the value for the HttpCookie . */
  var value: String = js.native
}

object HttpCookie {
  @scala.inline
  def apply(
    domain: String,
    expires: js.Date,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): HttpCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookie]
  }
  @scala.inline
  implicit class HttpCookieOps[Self <: HttpCookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
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

