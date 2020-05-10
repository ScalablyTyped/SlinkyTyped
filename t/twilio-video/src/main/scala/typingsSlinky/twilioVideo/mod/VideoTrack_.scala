package typingsSlinky.twilioVideo.mod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.raw.HTMLMediaElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.twilioVideo.mod.VideoTrack.Dimensions
import typingsSlinky.twilioVideo.twilioVideoStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "VideoTrack")
@js.native
class VideoTrack_ () extends Track {
  // Required for Safari if you want to detach without errors
  // See: https://github.com/twilio/twilio-video.js/issues/294#issuecomment-389708981
  var _attachments: js.UndefOr[js.Array[HTMLMediaElement]] = js.native
  var dimensions: Dimensions = js.native
  var isEnabled: Boolean = js.native
  var isStarted: Boolean = js.native
  @JSName("kind")
  var kind_VideoTrack_ : video = js.native
  var mediaStreamTrack: MediaStreamTrack = js.native
  def attach(): HTMLVideoElement = js.native
  def attach(element: String): HTMLVideoElement = js.native
  def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
  def detach(): js.Array[HTMLMediaElement] = js.native
  def detach(element: String): js.Array[HTMLMediaElement] = js.native
  def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
}

