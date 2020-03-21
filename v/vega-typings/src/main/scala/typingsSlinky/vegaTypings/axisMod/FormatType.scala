package typingsSlinky.vegaTypings.axisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.number
  - typingsSlinky.vegaTypings.vegaTypingsStrings.time
  - typingsSlinky.vegaTypings.vegaTypingsStrings.utc
*/
trait FormatType extends js.Object

object FormatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typingsSlinky.vegaTypings.vegaTypingsStrings.number = this.cast("number")
  @scala.inline
  def time: typingsSlinky.vegaTypings.vegaTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typingsSlinky.vegaTypings.vegaTypingsStrings.utc = this.cast("utc")
}

