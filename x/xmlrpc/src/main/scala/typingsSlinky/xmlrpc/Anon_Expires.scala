package typingsSlinky.xmlrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expires extends js.Object {
  var expires: js.Date
  var secure: Boolean
}

object Anon_Expires {
  @scala.inline
  def apply(expires: js.Date, secure: Boolean): Anon_Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Expires]
  }
}

