package typingsSlinky.stompit.connectMod

import typingsSlinky.node.netMod.IpcNetConnectOpts
import typingsSlinky.stompit.stompitBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetIpcConnectOptions
  extends IpcNetConnectOpts
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_NetIpcConnectOptions: js.UndefOr[`false`] = js.native
}

object NetIpcConnectOptions {
  @scala.inline
  def apply(path: String): NetIpcConnectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetIpcConnectOptions]
  }
  @scala.inline
  implicit class NetIpcConnectOptionsOps[Self <: NetIpcConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsl(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
  }
  
}

