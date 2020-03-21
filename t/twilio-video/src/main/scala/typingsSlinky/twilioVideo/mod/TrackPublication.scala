package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "TrackPublication")
@js.native
class TrackPublication () extends EventEmitter {
  var trackName: String = js.native
  var trackSid: SID = js.native
}

