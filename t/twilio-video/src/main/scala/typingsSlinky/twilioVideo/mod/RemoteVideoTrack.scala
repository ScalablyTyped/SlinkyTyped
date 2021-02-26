package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.twilioVideo.mod.Track.Priority
import typingsSlinky.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteVideoTrack")
@js.native
class RemoteVideoTrack ()
  extends VideoTrack
     with RemoteTrack {
  def this(options: EventEmitterOptions) = this()
  
  var isSwitchedOff: Boolean = js.native
  
  var priority: Priority | Null = js.native
  
  var sid: SID = js.native
}
