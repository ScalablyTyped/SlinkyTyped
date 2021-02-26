package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.std.Map
import typingsSlinky.twilioVideo.mod.Participant.Identity
import typingsSlinky.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "Participant")
@js.native
class Participant () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  var audioTracks: Map[SID, AudioTrackPublication] = js.native
  
  var dataTracks: Map[SID, DataTrackPublication] = js.native
  
  var identity: Identity = js.native
  
  var networkQualityLevel: NetworkQualityLevel | Null = js.native
  
  var networkQualityStats: NetworkQualityStats | Null = js.native
  
  var sid: typingsSlinky.twilioVideo.mod.Participant.SID = js.native
  
  var state: String = js.native
  
  var tracks: Map[SID, TrackPublication] = js.native
  
  var videoTracks: Map[SID, VideoTrackPublication] = js.native
}
object Participant {
  
  type Identity = String
  
  type SID = String
}
