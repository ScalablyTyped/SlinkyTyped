package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait storage extends js.Object {
  var cookie: typingsSlinky.webix.webix.cookie
  var local: typingsSlinky.webix.webix.local
  var session: typingsSlinky.webix.webix.session
}

object storage {
  @scala.inline
  def apply(cookie: cookie, local: local, session: session): storage = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[storage]
  }
}

