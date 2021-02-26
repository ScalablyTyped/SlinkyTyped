package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "TrackPublication")
@js.native
class TrackPublication () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  var trackName: String = js.native
  
  var trackSid: SID = js.native
}
