package typingsSlinky.socks.constantsMod

import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient connection options.
  */
@js.native
trait SocksClientOptions extends js.Object {
  var command: SocksCommandOption = js.native
  var destination: SocksRemoteHost = js.native
  var existing_socket: js.UndefOr[Duplex] = js.native
  var proxy: SocksProxy = js.native
  var set_tcp_nodelay: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object SocksClientOptions {
  @scala.inline
  def apply(command: SocksCommandOption, destination: SocksRemoteHost, proxy: SocksProxy): SocksClientOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientOptions]
  }
  @scala.inline
  implicit class SocksClientOptionsOps[Self <: SocksClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: SocksCommandOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: SocksRemoteHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxy(value: SocksProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExisting_socket(value: Duplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existing_socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExisting_socket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existing_socket")(js.undefined)
        ret
    }
    @scala.inline
    def withSet_tcp_nodelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_tcp_nodelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet_tcp_nodelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_tcp_nodelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

