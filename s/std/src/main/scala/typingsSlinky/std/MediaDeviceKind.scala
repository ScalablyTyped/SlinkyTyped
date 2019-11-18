package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.audioinput
  - typings.std.stdStrings.audiooutput
  - typings.std.stdStrings.videoinput
*/
trait MediaDeviceKind extends js.Object

object MediaDeviceKind {
  @scala.inline
  def audioinput: typingsSlinky.std.stdStrings.audioinput = this.cast("audioinput")
  @scala.inline
  def audiooutput: typingsSlinky.std.stdStrings.audiooutput = this.cast("audiooutput")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def videoinput: typingsSlinky.std.stdStrings.videoinput = this.cast("videoinput")
}

