package typingsSlinky.webrtc

import typingsSlinky.std.RTCRtpTransceiverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
@js.native
trait RTCRtpTransceiver extends js.Object {
  var direction: RTCRtpTransceiverDirection = js.native
  val mid: String | Null = js.native
  val receiver: RTCRtpReceiver = js.native
  val sender: RTCRtpSender = js.native
  val stopped: Boolean = js.native
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  def setDirection(direction: RTCRtpTransceiverDirection): Unit = js.native
  def stop(): Unit = js.native
}

object RTCRtpTransceiver {
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => Unit,
    setDirection: RTCRtpTransceiverDirection => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], setCodecPreferences = js.Any.fromFunction1(setCodecPreferences), setDirection = js.Any.fromFunction1(setDirection), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
  @scala.inline
  implicit class RTCRtpTransceiverOps[Self <: RTCRtpTransceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: RTCRtpTransceiverDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiver(value: RTCRtpReceiver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: RTCRtpSender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCodecPreferences(value: js.Array[RTCRtpCodecCapability] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCodecPreferences")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDirection(value: RTCRtpTransceiverDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(null)
        ret
    }
  }
  
}

