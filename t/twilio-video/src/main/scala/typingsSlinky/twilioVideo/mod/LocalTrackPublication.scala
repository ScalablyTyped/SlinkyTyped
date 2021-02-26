package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.twilioVideo.mod.Track.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalTrackPublication")
@js.native
class LocalTrackPublication () extends TrackPublication {
  def this(options: EventEmitterOptions) = this()
  
  var isTrackEnabled: Boolean = js.native
  
  var kind: Kind = js.native
  
  var track: LocalTrack = js.native
  
  def unpublish(): LocalTrackPublication = js.native
}
