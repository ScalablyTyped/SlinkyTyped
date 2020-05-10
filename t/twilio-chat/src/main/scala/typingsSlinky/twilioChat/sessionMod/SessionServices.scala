package typingsSlinky.twilioChat.sessionMod

import typingsSlinky.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionServices extends js.Object {
  var syncClient: SyncClient = js.native
}

object SessionServices {
  @scala.inline
  def apply(syncClient: SyncClient): SessionServices = {
    val __obj = js.Dynamic.literal(syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionServices]
  }
  @scala.inline
  implicit class SessionServicesOps[Self <: SessionServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyncClient(value: SyncClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncClient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

