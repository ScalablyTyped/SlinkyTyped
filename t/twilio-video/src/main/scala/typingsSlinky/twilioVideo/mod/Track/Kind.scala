package typingsSlinky.twilioVideo.mod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.twilioVideoStrings.audio
  - typingsSlinky.twilioVideo.twilioVideoStrings.video
  - typingsSlinky.twilioVideo.twilioVideoStrings.data
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def audio: typingsSlinky.twilioVideo.twilioVideoStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsSlinky.twilioVideo.twilioVideoStrings.data = this.cast("data")
  @scala.inline
  def video: typingsSlinky.twilioVideo.twilioVideoStrings.video = this.cast("video")
}

