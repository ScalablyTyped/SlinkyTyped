package typingsSlinky.xmlrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpires extends js.Object {
  var expires: js.Date
  var secure: Boolean
}

object AnonExpires {
  @scala.inline
  def apply(expires: js.Date, secure: Boolean): AnonExpires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpires]
  }
}

