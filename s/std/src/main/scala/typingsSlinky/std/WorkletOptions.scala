package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkletOptions extends js.Object {
  var credentials: js.UndefOr[org.scalajs.dom.experimental.RequestCredentials] = js.undefined
}

object WorkletOptions {
  @scala.inline
  def apply(credentials: org.scalajs.dom.experimental.RequestCredentials = null): WorkletOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkletOptions]
  }
}

