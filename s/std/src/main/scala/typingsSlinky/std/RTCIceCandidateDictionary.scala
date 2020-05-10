package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceCandidateDictionary extends RTCIceGatherCandidate {
  var foundation: js.UndefOr[java.lang.String] = js.native
  var ip: js.UndefOr[java.lang.String] = js.native
  var msMTurnSessionId: js.UndefOr[java.lang.String] = js.native
  var port: js.UndefOr[Double] = js.native
  var priority: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[RTCIceProtocol] = js.native
  var relatedAddress: js.UndefOr[java.lang.String] = js.native
  var relatedPort: js.UndefOr[Double] = js.native
  var tcpType: js.UndefOr[RTCIceTcpCandidateType] = js.native
  var `type`: js.UndefOr[RTCIceCandidateType] = js.native
}

object RTCIceCandidateDictionary {
  @scala.inline
  def apply(): RTCIceCandidateDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateDictionary]
  }
  @scala.inline
  implicit class RTCIceCandidateDictionaryOps[Self <: RTCIceCandidateDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoundation(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoundation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundation")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withMsMTurnSessionId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMTurnSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsMTurnSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMTurnSessionId")(js.undefined)
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
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: RTCIceProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedAddress(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpType(value: RTCIceTcpCandidateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RTCIceCandidateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

