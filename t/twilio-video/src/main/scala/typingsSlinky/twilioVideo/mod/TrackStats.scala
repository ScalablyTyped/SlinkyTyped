package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.mod.Track.ID
import typingsSlinky.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "TrackStats")
@js.native
class TrackStats () extends js.Object {
  
  var codec: String | Null = js.native
  
  var packetsLost: Double | Null = js.native
  
  var ssrc: String = js.native
  
  var timestamp: Double = js.native
  
  var trackId: ID = js.native
  
  var trackSid: SID = js.native
}
