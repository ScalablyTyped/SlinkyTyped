package typingsSlinky.socks.constantsMod

import typingsSlinky.socks.socksBooleans.`false`
import typingsSlinky.socks.socksStrings.connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient chain connection options.
  */
@js.native
trait SocksClientChainOptions extends js.Object {
  var command: connect = js.native
  var destination: SocksRemoteHost = js.native
  var proxies: js.Array[SocksProxy] = js.native
  var randomizeChain: js.UndefOr[`false`] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object SocksClientChainOptions {
  @scala.inline
  def apply(command: connect, destination: SocksRemoteHost, proxies: js.Array[SocksProxy]): SocksClientChainOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientChainOptions]
  }
  @scala.inline
  implicit class SocksClientChainOptionsOps[Self <: SocksClientChainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: connect): Self = {
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
    def withProxies(value: js.Array[SocksProxy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandomizeChain(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomizeChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeChain")(js.undefined)
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

