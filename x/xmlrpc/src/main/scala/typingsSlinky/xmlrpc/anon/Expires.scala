package typingsSlinky.xmlrpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expires extends js.Object {
  var expires: js.Date
  var secure: Boolean
}

object Expires {
  @scala.inline
  def apply(expires: js.Date, secure: Boolean): Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
}

