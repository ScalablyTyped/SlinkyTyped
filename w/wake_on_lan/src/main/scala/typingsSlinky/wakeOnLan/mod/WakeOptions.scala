package typingsSlinky.wakeOnLan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WakeOptions extends js.Object {
  /**
  		 * The ip address to which the packet is send  (default: 255.255.255.255)
  		 */
  var address: js.UndefOr[String] = js.native
  /**
  		 * The interval between packets (default: 100ms)
  		 */
  var interval: js.UndefOr[Double] = js.native
  /**
  		 * Number of packets to send (default: 3)
  		 */
  var num_packets: js.UndefOr[Double] = js.native
  /**
  		 * The port to send to (default: 9)
  		 */
  var port: js.UndefOr[Double] = js.native
}

object WakeOptions {
  @scala.inline
  def apply(): WakeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WakeOptions]
  }
  @scala.inline
  implicit class WakeOptionsOps[Self <: WakeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_packets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_packets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_packets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_packets")(js.undefined)
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

