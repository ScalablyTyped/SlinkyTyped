package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.lowpass
  - typings.std.stdStrings.highpass
  - typings.std.stdStrings.bandpass
  - typings.std.stdStrings.lowshelf
  - typings.std.stdStrings.highshelf
  - typings.std.stdStrings.peaking
  - typings.std.stdStrings.notch
  - typings.std.stdStrings.allpass
*/
trait BiquadFilterType extends js.Object

object BiquadFilterType {
  @scala.inline
  def allpass: typingsSlinky.std.stdStrings.allpass = this.cast("allpass")
  @scala.inline
  def bandpass: typingsSlinky.std.stdStrings.bandpass = this.cast("bandpass")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def highpass: typingsSlinky.std.stdStrings.highpass = this.cast("highpass")
  @scala.inline
  def highshelf: typingsSlinky.std.stdStrings.highshelf = this.cast("highshelf")
  @scala.inline
  def lowpass: typingsSlinky.std.stdStrings.lowpass = this.cast("lowpass")
  @scala.inline
  def lowshelf: typingsSlinky.std.stdStrings.lowshelf = this.cast("lowshelf")
  @scala.inline
  def notch: typingsSlinky.std.stdStrings.notch = this.cast("notch")
  @scala.inline
  def peaking: typingsSlinky.std.stdStrings.peaking = this.cast("peaking")
}

