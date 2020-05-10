package typingsSlinky.sockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var disconnect_delay: js.UndefOr[Double] = js.native
  var heartbeat_delay: js.UndefOr[Double] = js.native
  var jsessionid: js.UndefOr[js.Any] = js.native
  var log: js.UndefOr[js.Function2[/* severity */ String, /* message */ String, Unit]] = js.native
  var prefix: js.UndefOr[String] = js.native
  var response_limit: js.UndefOr[Double] = js.native
  var sockjs_url: js.UndefOr[String] = js.native
  var websocket: js.UndefOr[Boolean] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnect_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisconnect_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeat_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeat_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withJsessionid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsessionid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsessionid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsessionid")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: (/* severity */ String, /* message */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSockjs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockjs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSockjs_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockjs_url")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsocket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket")(js.undefined)
        ret
    }
  }
  
}

