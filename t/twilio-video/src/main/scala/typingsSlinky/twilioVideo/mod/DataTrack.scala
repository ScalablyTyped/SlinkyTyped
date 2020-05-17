package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.mod.LocalDataTrack
  - typingsSlinky.twilioVideo.mod.RemoteDataTrack
*/
trait DataTrack extends js.Object

object DataTrack {
  @scala.inline
  implicit def apply(value: LocalDataTrack): DataTrack = value.asInstanceOf[DataTrack]
  @scala.inline
  implicit def apply(value: RemoteDataTrack): DataTrack = value.asInstanceOf[DataTrack]
}

