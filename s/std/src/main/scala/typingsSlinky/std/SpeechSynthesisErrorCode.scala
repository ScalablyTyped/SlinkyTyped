package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.canceled
  - typings.std.stdStrings.interrupted
  - typings.std.stdStrings.`audio-busy`
  - typings.std.stdStrings.`audio-hardware`
  - typings.std.stdStrings.network
  - typings.std.stdStrings.`synthesis-unavailable`
  - typings.std.stdStrings.`synthesis-failed`
  - typings.std.stdStrings.`language-unavailable`
  - typings.std.stdStrings.`voice-unavailable`
  - typings.std.stdStrings.`text-too-long`
  - typings.std.stdStrings.`invalid-argument`
*/
trait SpeechSynthesisErrorCode extends js.Object

object SpeechSynthesisErrorCode {
  @scala.inline
  def `audio-busy`: typingsSlinky.std.stdStrings.`audio-busy` = this.cast("audio-busy")
  @scala.inline
  def `audio-hardware`: typingsSlinky.std.stdStrings.`audio-hardware` = this.cast("audio-hardware")
  @scala.inline
  def canceled: typingsSlinky.std.stdStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interrupted: typingsSlinky.std.stdStrings.interrupted = this.cast("interrupted")
  @scala.inline
  def `invalid-argument`: typingsSlinky.std.stdStrings.`invalid-argument` = this.cast("invalid-argument")
  @scala.inline
  def `language-unavailable`: typingsSlinky.std.stdStrings.`language-unavailable` = this.cast("language-unavailable")
  @scala.inline
  def network: typingsSlinky.std.stdStrings.network = this.cast("network")
  @scala.inline
  def `synthesis-failed`: typingsSlinky.std.stdStrings.`synthesis-failed` = this.cast("synthesis-failed")
  @scala.inline
  def `synthesis-unavailable`: typingsSlinky.std.stdStrings.`synthesis-unavailable` = this.cast("synthesis-unavailable")
  @scala.inline
  def `text-too-long`: typingsSlinky.std.stdStrings.`text-too-long` = this.cast("text-too-long")
  @scala.inline
  def `voice-unavailable`: typingsSlinky.std.stdStrings.`voice-unavailable` = this.cast("voice-unavailable")
}

