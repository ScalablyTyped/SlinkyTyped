package typingsSlinky.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpreceiver
@js.native
trait RTCRtpReceiver extends js.Object {
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def getParameters(): RTCRtpParameters = js.native
}

object RTCRtpReceiver {
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpParameters
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters))
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  @scala.inline
  implicit class RTCRtpReceiverOps[Self <: RTCRtpReceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContributingSources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameters(value: () => RTCRtpParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

