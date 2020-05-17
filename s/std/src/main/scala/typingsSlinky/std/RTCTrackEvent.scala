package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTrackEvent extends Event {
  val receiver: RTCRtpReceiver = js.native
  val streams: js.Array[org.scalajs.dom.experimental.mediastream.MediaStream] = js.native
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  val transceiver: RTCRtpTransceiver = js.native
}

