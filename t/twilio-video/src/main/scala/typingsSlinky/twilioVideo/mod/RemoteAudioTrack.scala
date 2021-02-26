package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteAudioTrack")
@js.native
class RemoteAudioTrack ()
  extends AudioTrack
     with RemoteTrack {
  def this(options: EventEmitterOptions) = this()
  
  var sid: SID = js.native
}
