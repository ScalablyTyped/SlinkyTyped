package typingsSlinky.sipJs.webTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  /**
    * Seconds to wait for WebSocket to connect before giving up.
    * @defaultValue `5`
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  /**
    * Keep alive - needs review.
    * @internal
    */
  var keepAliveDebounce: js.UndefOr[Double] = js.native
  /**
    * Keep alive - needs review.
    * @internal
    */
  var keepAliveInterval: js.UndefOr[Double] = js.native
  /**
    * URL of WebSocket server to connect with. For example, "wss://localhost:8080".
    */
  var server: String = js.native
  /**
    * If true, messsages sent and received by the transport are logged.
    * @defaultValue `true`
    */
  var traceSip: js.UndefOr[Boolean] = js.native
}

object TransportOptions {
  @scala.inline
  def apply(server: String): TransportOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
  @scala.inline
  implicit class TransportOptionsOps[Self <: TransportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDebounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDebounce")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceSip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceSip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceSip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceSip")(js.undefined)
        ret
    }
  }
  
}

