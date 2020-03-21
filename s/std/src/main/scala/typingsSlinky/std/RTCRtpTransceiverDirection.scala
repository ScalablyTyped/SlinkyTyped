package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.inactive
  - typingsSlinky.std.stdStrings.recvonly
  - typingsSlinky.std.stdStrings.sendonly
  - typingsSlinky.std.stdStrings.sendrecv
  - typingsSlinky.std.stdStrings.stopped
*/
trait RTCRtpTransceiverDirection extends js.Object

object RTCRtpTransceiverDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.std.stdStrings.inactive = this.cast("inactive")
  @scala.inline
  def recvonly: typingsSlinky.std.stdStrings.recvonly = this.cast("recvonly")
  @scala.inline
  def sendonly: typingsSlinky.std.stdStrings.sendonly = this.cast("sendonly")
  @scala.inline
  def sendrecv: typingsSlinky.std.stdStrings.sendrecv = this.cast("sendrecv")
  @scala.inline
  def stopped: typingsSlinky.std.stdStrings.stopped = this.cast("stopped")
}

