package typingsSlinky.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsTransport extends js.Object {
  var onstatechange: DtlsTransportEventHandler = js.native
  val transport: RTCIceTransport = js.native
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[js.typedarray.ArrayBuffer] = js.native
}

object RTCDtlsTransport {
  @scala.inline
  def apply(getRemoteCertificates: () => js.Array[js.typedarray.ArrayBuffer], transport: RTCIceTransport): RTCDtlsTransport = {
    val __obj = js.Dynamic.literal(getRemoteCertificates = js.Any.fromFunction0(getRemoteCertificates), transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransport]
  }
  @scala.inline
  implicit class RTCDtlsTransportOps[Self <: RTCDtlsTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRemoteCertificates(value: () => js.Array[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteCertificates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransport(value: RTCIceTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstatechange(value: DtlsTransportEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstatechangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstatechange")(null)
        ret
    }
  }
  
}

