package typingsSlinky.socketclusterServer.serversocketMod

import typingsSlinky.socketclusterServer.socketclusterServerStrings.authenticated
import typingsSlinky.socketclusterServer.socketclusterServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateChangeData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.native
  var newState: authenticated | unauthenticated = js.native
  var oldState: authenticated | unauthenticated = js.native
}

object StateChangeData {
  @scala.inline
  def apply(newState: authenticated | unauthenticated, oldState: authenticated | unauthenticated): StateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeData]
  }
  @scala.inline
  implicit class StateChangeDataOps[Self <: StateChangeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewState(value: authenticated | unauthenticated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldState(value: authenticated | unauthenticated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthToken(value: AuthToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(js.undefined)
        ret
    }
  }
  
}

