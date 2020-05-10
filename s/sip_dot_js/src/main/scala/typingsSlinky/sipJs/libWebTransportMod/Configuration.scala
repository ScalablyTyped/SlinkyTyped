package typingsSlinky.sipJs.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var connectionTimeout: Double = js.native
  var keepAliveDebounce: Double = js.native
  var keepAliveInterval: Double = js.native
  var maxReconnectionAttempts: Double = js.native
  var reconnectionTimeout: Double = js.native
  var traceSip: Boolean = js.native
  var wsServers: js.Array[WsServer] = js.native
}

object Configuration {
  @scala.inline
  def apply(
    connectionTimeout: Double,
    keepAliveDebounce: Double,
    keepAliveInterval: Double,
    maxReconnectionAttempts: Double,
    reconnectionTimeout: Double,
    traceSip: Boolean,
    wsServers: js.Array[WsServer]
  ): Configuration = {
    val __obj = js.Dynamic.literal(connectionTimeout = connectionTimeout.asInstanceOf[js.Any], keepAliveDebounce = keepAliveDebounce.asInstanceOf[js.Any], keepAliveInterval = keepAliveInterval.asInstanceOf[js.Any], maxReconnectionAttempts = maxReconnectionAttempts.asInstanceOf[js.Any], reconnectionTimeout = reconnectionTimeout.asInstanceOf[js.Any], traceSip = traceSip.asInstanceOf[js.Any], wsServers = wsServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepAliveDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveDebounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepAliveInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxReconnectionAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectionAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceSip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceSip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWsServers(value: js.Array[WsServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsServers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

