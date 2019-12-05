package typingsSlinky.twilioDashVideo.twilioDashVideoMod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashVideo.twilioDashVideoStrings.audio
  - typings.twilioDashVideo.twilioDashVideoStrings.video
  - typings.twilioDashVideo.twilioDashVideoStrings.data
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def audio: typingsSlinky.twilioDashVideo.twilioDashVideoStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsSlinky.twilioDashVideo.twilioDashVideoStrings.data = this.cast("data")
  @scala.inline
  def video: typingsSlinky.twilioDashVideo.twilioDashVideoStrings.video = this.cast("video")
}

