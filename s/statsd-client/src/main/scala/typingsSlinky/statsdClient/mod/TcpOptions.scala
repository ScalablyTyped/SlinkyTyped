package typingsSlinky.statsdClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpOptions extends CommonOptions {
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Port to contact the statsd-daemon on (default 8125).
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Number of timeouts in which the socket auto-closes if it 
    * has been inactive. (default 10; 1 to auto-close after a 
    * single timeout).
    */
  var socketTimeoutsToClose: Double = js.native
}

object TcpOptions {
  @scala.inline
  def apply(socketTimeoutsToClose: Double): TcpOptions = {
    val __obj = js.Dynamic.literal(socketTimeoutsToClose = socketTimeoutsToClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpOptions]
  }
  @scala.inline
  implicit class TcpOptionsOps[Self <: TcpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocketTimeoutsToClose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketTimeoutsToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

