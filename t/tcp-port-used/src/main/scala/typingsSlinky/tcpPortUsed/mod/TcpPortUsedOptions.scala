package typingsSlinky.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpPortUsedOptions extends js.Object {
  var host: String = js.native
  var port: Double = js.native
  var retryTimeMs: Double = js.native
  var status: Boolean = js.native
  var timeOutMs: Double = js.native
}

object TcpPortUsedOptions {
  @scala.inline
  def apply(host: String, port: Double, retryTimeMs: Double, status: Boolean, timeOutMs: Double): TcpPortUsedOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], retryTimeMs = retryTimeMs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeOutMs = timeOutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpPortUsedOptions]
  }
  @scala.inline
  implicit class TcpPortUsedOptionsOps[Self <: TcpPortUsedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutMs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

