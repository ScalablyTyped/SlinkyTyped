package typingsSlinky.xmlrpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expires extends js.Object {
  var expires: js.Date = js.native
  var secure: Boolean = js.native
}

object Expires {
  @scala.inline
  def apply(expires: js.Date, secure: Boolean): Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
  @scala.inline
  implicit class ExpiresOps[Self <: Expires] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

