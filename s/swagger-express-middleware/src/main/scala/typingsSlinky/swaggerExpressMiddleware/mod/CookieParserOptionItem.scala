package typingsSlinky.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieParserOptionItem extends js.Object {
  /**
    *  an object that is passed to cookie.parse as the second option
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * A string or array used for signing cookies.
    * This is optional and if not specified, will not parse signed cookies.
    * If a string is provided, this is used as the secret.
    * If an array is provided, an attempt will be made to unsign the cookie with each secret in order.
    */
  var secret: js.UndefOr[String | js.Array[String]] = js.native
}

object CookieParserOptionItem {
  @scala.inline
  def apply(): CookieParserOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieParserOptionItem]
  }
  @scala.inline
  implicit class CookieParserOptionItemOps[Self <: CookieParserOptionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
  }
  
}

