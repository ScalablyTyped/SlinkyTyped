package typingsSlinky.websocket.mod

import typingsSlinky.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientConfig extends IConfig {
  /**
    * Options to pass to https.request if connecting via TLS.
    * See Node's HTTPS documentation
    * @see https://nodejs.org/api/https.html#https_https_request_options_callback
    */
  var tlsOptions: js.UndefOr[RequestOptions] = js.native
  /**
    * Which version of the WebSocket protocol to use when making the connection.
    * Currently supported values are 8 and 13. This option will be removed once the
    * protocol is finalized by the IETF It is only available to ease the transition
    * through the intermediate draft protocol versions. The only thing this affects
    * the name of the Origin header.
    * @default 13
    */
  var webSocketVersion: js.UndefOr[Double] = js.native
}

object IClientConfig {
  @scala.inline
  def apply(): IClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientConfig]
  }
  @scala.inline
  implicit class IClientConfigOps[Self <: IClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTlsOptions(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocketVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocketVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketVersion")(js.undefined)
        ret
    }
  }
  
}

