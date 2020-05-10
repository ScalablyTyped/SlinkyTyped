package typingsSlinky.stompit.connectMod

import typingsSlinky.node.netMod.Socket
import typingsSlinky.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConnectOptions extends SocketOptions {
  var connect: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[js.Function0[Unit]], 
      Socket
    ]
  ] = js.native
  var connectHeaders: js.UndefOr[ConnectHeaders] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
}

object BaseConnectOptions {
  @scala.inline
  def apply(): BaseConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConnectOptions]
  }
  @scala.inline
  implicit class BaseConnectOptionsOps[Self <: BaseConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(
      value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => Socket
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectHeaders(value: ConnectHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
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

