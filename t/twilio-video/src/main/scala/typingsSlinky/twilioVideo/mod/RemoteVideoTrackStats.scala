package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.mod.VideoTrack.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteVideoTrackStats")
@js.native
class RemoteVideoTrackStats () extends RemoteTrackStats {
  var dimensions: Dimensions | Null = js.native
  var frameRate: Double | Null = js.native
}

