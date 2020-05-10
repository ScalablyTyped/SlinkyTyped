package typingsSlinky.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebDriverOptionsCookie extends js.Object {
  /**
    * The domain the cookie is visible to. Defaults to the current browsing
    * context's document's URL when adding a cookie.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * When the cookie expires.
    *
    * When {@linkplain Options#addCookie() adding a cookie}, this may be
    * specified in _seconds_ since Unix epoch (January 1, 1970). The expiry will
    * default to 20 years in the future if omitted.
    *
    * The expiry is always returned in seconds since epoch when
    * {@linkplain Options#getCookies() retrieving cookies} from the browser.
    *
    * @type {(!Date|number|undefined)}
    */
  var expiry: js.UndefOr[Double | js.Date] = js.native
  /**
    * Whether the cookie is an HTTP only cookie. Defaults to false when adding a
    * new cookie.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  /**
    * The name of the cookie.
    */
  var name: String = js.native
  /**
    * The cookie path. Defaults to "/" when adding a cookie.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Whether the cookie is a secure cookie. Defaults to false when adding a new
    * cookie.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * The cookie value.
    */
  var value: String = js.native
}

object IWebDriverOptionsCookie {
  @scala.inline
  def apply(name: String, value: String): IWebDriverOptionsCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebDriverOptionsCookie]
  }
  @scala.inline
  implicit class IWebDriverOptionsCookieOps[Self <: IWebDriverOptionsCookie] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiry(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
  }
  
}

