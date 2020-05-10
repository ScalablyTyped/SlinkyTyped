package typingsSlinky.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeauthenticateData extends js.Object {
  var oldAuthToken: js.UndefOr[AuthToken] = js.native
}

object DeauthenticateData {
  @scala.inline
  def apply(): DeauthenticateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeauthenticateData]
  }
  @scala.inline
  implicit class DeauthenticateDataOps[Self <: DeauthenticateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldAuthToken(value: AuthToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldAuthToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldAuthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldAuthToken")(js.undefined)
        ret
    }
  }
  
}

