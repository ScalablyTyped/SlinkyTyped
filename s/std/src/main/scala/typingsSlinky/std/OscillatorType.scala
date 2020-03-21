package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.custom
  - typingsSlinky.std.stdStrings.sawtooth
  - typingsSlinky.std.stdStrings.sine
  - typingsSlinky.std.stdStrings.square
  - typingsSlinky.std.stdStrings.triangle
*/
trait OscillatorType extends js.Object

object OscillatorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typingsSlinky.std.stdStrings.custom = this.cast("custom")
  @scala.inline
  def sawtooth: typingsSlinky.std.stdStrings.sawtooth = this.cast("sawtooth")
  @scala.inline
  def sine: typingsSlinky.std.stdStrings.sine = this.cast("sine")
  @scala.inline
  def square: typingsSlinky.std.stdStrings.square = this.cast("square")
  @scala.inline
  def triangle: typingsSlinky.std.stdStrings.triangle = this.cast("triangle")
}

