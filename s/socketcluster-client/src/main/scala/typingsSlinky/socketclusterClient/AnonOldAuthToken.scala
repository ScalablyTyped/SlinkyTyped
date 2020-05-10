package typingsSlinky.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOldAuthToken extends js.Object {
  var oldAuthToken: js.Object = js.native
}

object AnonOldAuthToken {
  @scala.inline
  def apply(oldAuthToken: js.Object): AnonOldAuthToken = {
    val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldAuthToken]
  }
  @scala.inline
  implicit class AnonOldAuthTokenOps[Self <: AnonOldAuthToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldAuthToken(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldAuthToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

