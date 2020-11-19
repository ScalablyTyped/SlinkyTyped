package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.twilioVideoStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalAudioTrackPublication")
@js.native
class LocalAudioTrackPublication ()
  extends LocalTrackPublication
     with AudioTrackPublication {
  
  @JSName("kind")
  var kind_LocalAudioTrackPublication: audio = js.native
  
  @JSName("track")
  var track_LocalAudioTrackPublication: LocalAudioTrack = js.native
}
