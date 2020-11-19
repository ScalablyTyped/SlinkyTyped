package typingsSlinky.twilioVideo.mod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.raw.HTMLMediaElement
import typingsSlinky.twilioVideo.twilioVideoStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "AudioTrack")
@js.native
class AudioTrack () extends Track {
  
  // Required for Safari if you want to detach without errors
  // See: https://github.com/twilio/twilio-video.js/issues/294#issuecomment-389708981
  var _attachments: js.UndefOr[js.Array[HTMLMediaElement]] = js.native
  
  def attach(): HTMLMediaElement = js.native
  def attach(element: String): HTMLMediaElement = js.native
  def attach(element: HTMLMediaElement): HTMLMediaElement = js.native
  
  def detach(): js.Array[HTMLMediaElement] = js.native
  def detach(element: String): js.Array[HTMLMediaElement] = js.native
  def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
  
  var isEnabled: Boolean = js.native
  
  var isStarted: Boolean = js.native
  
  @JSName("kind")
  var kind_AudioTrack: audio = js.native
  
  var mediaStreamTrack: MediaStreamTrack = js.native
}
