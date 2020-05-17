package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.mod.RemoteAudioTrack
  - typingsSlinky.twilioVideo.mod.RemoteVideoTrack
  - typingsSlinky.twilioVideo.mod.RemoteDataTrack
*/
trait RemoteTrack extends js.Object

object RemoteTrack {
  @scala.inline
  implicit def apply(value: RemoteAudioTrack): RemoteTrack = value.asInstanceOf[RemoteTrack]
  @scala.inline
  implicit def apply(value: RemoteDataTrack): RemoteTrack = value.asInstanceOf[RemoteTrack]
  @scala.inline
  implicit def apply(value: RemoteVideoTrack): RemoteTrack = value.asInstanceOf[RemoteTrack]
}

