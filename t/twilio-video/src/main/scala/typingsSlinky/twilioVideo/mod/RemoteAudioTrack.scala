package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteAudioTrack")
@js.native
class RemoteAudioTrack ()
  extends AudioTrack
     with RemoteTrack {
  var sid: SID = js.native
}

