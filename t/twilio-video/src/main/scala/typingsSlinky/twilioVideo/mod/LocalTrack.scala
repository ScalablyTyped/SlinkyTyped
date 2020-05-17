package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.mod.LocalAudioTrack
  - typingsSlinky.twilioVideo.mod.LocalVideoTrack
  - typingsSlinky.twilioVideo.mod.LocalDataTrack
*/
trait LocalTrack extends js.Object

object LocalTrack {
  @scala.inline
  implicit def apply(value: LocalAudioTrack): LocalTrack = value.asInstanceOf[LocalTrack]
  @scala.inline
  implicit def apply(value: LocalDataTrack): LocalTrack = value.asInstanceOf[LocalTrack]
  @scala.inline
  implicit def apply(value: LocalVideoTrack): LocalTrack = value.asInstanceOf[LocalTrack]
}

