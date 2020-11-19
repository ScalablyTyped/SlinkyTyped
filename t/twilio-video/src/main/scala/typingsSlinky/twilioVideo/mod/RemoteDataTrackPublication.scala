package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.twilioVideoStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteDataTrackPublication")
@js.native
class RemoteDataTrackPublication ()
  extends RemoteTrackPublication
     with DataTrackPublication {
  
  @JSName("kind")
  var kind_RemoteDataTrackPublication: data = js.native
  
  @JSName("track")
  var track_RemoteDataTrackPublication: RemoteDataTrack | Null = js.native
}
