package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.std.Map
import typingsSlinky.twilioVideo.mod.Participant.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "Room")
@js.native
class Room () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def disconnect(): Room = js.native
  
  var dominantSpeaker: RemoteParticipant | Null = js.native
  
  def getStats(): js.Promise[js.Array[StatsReport]] = js.native
  
  var isRecording: Boolean = js.native
  
  var localParticipant: LocalParticipant = js.native
  
  var mediaRegion: String = js.native
  
  var name: String = js.native
  
  var participants: Map[SID, RemoteParticipant] = js.native
  
  var sid: typingsSlinky.twilioVideo.mod.Room.SID = js.native
  
  var state: String = js.native
}
object Room {
  
  type SID = String
}
