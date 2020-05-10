package typingsSlinky.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFoundation extends js.Object {
  var component: Double = js.native
  var foundation: String = js.native
  var generation: js.UndefOr[Double] = js.native
  var ip: String = js.native
  var `network-cost`: js.UndefOr[Double] = js.native
  var `network-id`: js.UndefOr[Double] = js.native
  var port: Double = js.native
  var priority: Double | String = js.native
  var raddr: js.UndefOr[String] = js.native
  var rport: js.UndefOr[Double] = js.native
  var tcptype: js.UndefOr[String] = js.native
  var transport: String = js.native
  var `type`: String = js.native
}

object AnonFoundation {
  @scala.inline
  def apply(
    component: Double,
    foundation: String,
    ip: String,
    port: Double,
    priority: Double | String,
    transport: String,
    `type`: String
  ): AnonFoundation = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFoundation]
  }
  @scala.inline
  implicit class AnonFoundationOps[Self <: AnonFoundation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFoundation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def `withNetwork-cost`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network-cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNetwork-cost`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network-cost")(js.undefined)
        ret
    }
    @scala.inline
    def `withNetwork-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNetwork-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network-id")(js.undefined)
        ret
    }
    @scala.inline
    def withRaddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raddr")(js.undefined)
        ret
    }
    @scala.inline
    def withRport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rport")(js.undefined)
        ret
    }
    @scala.inline
    def withTcptype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcptype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcptype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcptype")(js.undefined)
        ret
    }
  }
  
}

