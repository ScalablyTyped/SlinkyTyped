package typingsSlinky.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an intent to communicate with a specific remote system (device). */
@js.native
trait RemoteSystemConnectionRequest extends js.Object {
  /** Represents the remote system (device) that the app intends to communicate with. */
  var remoteSystem: RemoteSystem = js.native
  /** Represents the remote application that the app intends to communicate with. */
  var remoteSystemApp: RemoteSystemApp = js.native
}

object RemoteSystemConnectionRequest {
  @scala.inline
  def apply(remoteSystem: RemoteSystem, remoteSystemApp: RemoteSystemApp): RemoteSystemConnectionRequest = {
    val __obj = js.Dynamic.literal(remoteSystem = remoteSystem.asInstanceOf[js.Any], remoteSystemApp = remoteSystemApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemConnectionRequest]
  }
  @scala.inline
  implicit class RemoteSystemConnectionRequestOps[Self <: RemoteSystemConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteSystem(value: RemoteSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteSystemApp(value: RemoteSystemApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSystemApp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

