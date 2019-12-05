package typingsSlinky.twilioDashVideo.twilioDashVideoMod

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.std.HTMLMediaElement
import typingsSlinky.twilioDashVideo.twilioDashVideoMod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteVideoTrack")
@js.native
class RemoteVideoTrack ()
  extends VideoTrack
     with RemoteTrack {
  var sid: SID = js.native
  /* InferMemberOverrides */
  override def attach(): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def attach(element: String): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def detach(): js.Array[org.scalajs.dom.raw.HTMLMediaElement] = js.native
  /* InferMemberOverrides */
  override def detach(element: String): js.Array[org.scalajs.dom.raw.HTMLMediaElement] = js.native
  /* InferMemberOverrides */
  override def detach(element: HTMLMediaElement): js.Array[org.scalajs.dom.raw.HTMLMediaElement] = js.native
}

