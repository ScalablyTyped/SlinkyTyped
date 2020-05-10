package typingsSlinky.zmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  var _fd: Double = js.native
  var _ioevents: Double = js.native
  var _receiveMore: Double = js.native
  var _subscribe: Double = js.native
  var _unsubscribe: Double = js.native
  var affinity: Double = js.native
  var backlog: Double = js.native
  var hwm: Double = js.native
  var identity: Double = js.native
  var last_endpoint: Double = js.native
  var linger: Double = js.native
  var mcast_loop: Double = js.native
  var rate: Double = js.native
  var rcvbuf: Double = js.native
  var reconnect_ivl: Double = js.native
  var recovery_ivl: Double = js.native
  var sndbuf: Double = js.native
  var swap: Double = js.native
}

object SocketOptions {
  @scala.inline
  def apply(
    _fd: Double,
    _ioevents: Double,
    _receiveMore: Double,
    _subscribe: Double,
    _unsubscribe: Double,
    affinity: Double,
    backlog: Double,
    hwm: Double,
    identity: Double,
    last_endpoint: Double,
    linger: Double,
    mcast_loop: Double,
    rate: Double,
    rcvbuf: Double,
    reconnect_ivl: Double,
    recovery_ivl: Double,
    sndbuf: Double,
    swap: Double
  ): SocketOptions = {
    val __obj = js.Dynamic.literal(_fd = _fd.asInstanceOf[js.Any], _ioevents = _ioevents.asInstanceOf[js.Any], _receiveMore = _receiveMore.asInstanceOf[js.Any], _subscribe = _subscribe.asInstanceOf[js.Any], _unsubscribe = _unsubscribe.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], backlog = backlog.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_endpoint = last_endpoint.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], mcast_loop = mcast_loop.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], rcvbuf = rcvbuf.asInstanceOf[js.Any], reconnect_ivl = reconnect_ivl.asInstanceOf[js.Any], recovery_ivl = recovery_ivl.asInstanceOf[js.Any], sndbuf = sndbuf.asInstanceOf[js.Any], swap = swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_fd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ioevents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ioevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_receiveMore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_receiveMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_subscribe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_unsubscribe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_unsubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffinity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBacklog(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHwm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_endpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMcast_loop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcast_loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRcvbuf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcvbuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnect_ivl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect_ivl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecovery_ivl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recovery_ivl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSndbuf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sndbuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

