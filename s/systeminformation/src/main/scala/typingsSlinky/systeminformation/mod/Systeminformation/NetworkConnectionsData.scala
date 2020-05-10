package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConnectionsData extends js.Object {
  var localaddress: String = js.native
  var localport: String = js.native
  var peeraddress: String = js.native
  var peerport: String = js.native
  var pid: Double = js.native
  var process: String = js.native
  var protocol: String = js.native
  var state: String = js.native
}

object NetworkConnectionsData {
  @scala.inline
  def apply(
    localaddress: String,
    localport: String,
    peeraddress: String,
    peerport: String,
    pid: Double,
    process: String,
    protocol: String,
    state: String
  ): NetworkConnectionsData = {
    val __obj = js.Dynamic.literal(localaddress = localaddress.asInstanceOf[js.Any], localport = localport.asInstanceOf[js.Any], peeraddress = peeraddress.asInstanceOf[js.Any], peerport = peerport.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConnectionsData]
  }
  @scala.inline
  implicit class NetworkConnectionsDataOps[Self <: NetworkConnectionsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocaladdress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeeraddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeraddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

