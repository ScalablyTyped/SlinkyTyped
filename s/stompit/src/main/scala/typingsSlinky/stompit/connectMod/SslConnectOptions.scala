package typingsSlinky.stompit.connectMod

import typingsSlinky.node.tlsMod.ConnectionOptions
import typingsSlinky.stompit.stompitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslConnectOptions
  extends ConnectionOptions
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_SslConnectOptions: `true` = js.native
}

object SslConnectOptions {
  @scala.inline
  def apply(ssl: `true`): SslConnectOptions = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslConnectOptions]
  }
  @scala.inline
  implicit class SslConnectOptionsOps[Self <: SslConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsl(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

