package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.axisMod._TickCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.millisecond
  - typingsSlinky.vegaTypings.vegaTypingsStrings.second
  - typingsSlinky.vegaTypings.vegaTypingsStrings.minute
  - typingsSlinky.vegaTypings.vegaTypingsStrings.hour
  - typingsSlinky.vegaTypings.vegaTypingsStrings.day
  - typingsSlinky.vegaTypings.vegaTypingsStrings.week
  - typingsSlinky.vegaTypings.vegaTypingsStrings.month
  - typingsSlinky.vegaTypings.vegaTypingsStrings.year
*/
trait TimeInterval extends _TickCount

object TimeInterval {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsSlinky.vegaTypings.vegaTypingsStrings.day = this.cast("day")
  @scala.inline
  def hour: typingsSlinky.vegaTypings.vegaTypingsStrings.hour = this.cast("hour")
  @scala.inline
  def millisecond: typingsSlinky.vegaTypings.vegaTypingsStrings.millisecond = this.cast("millisecond")
  @scala.inline
  def minute: typingsSlinky.vegaTypings.vegaTypingsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typingsSlinky.vegaTypings.vegaTypingsStrings.month = this.cast("month")
  @scala.inline
  def second: typingsSlinky.vegaTypings.vegaTypingsStrings.second = this.cast("second")
  @scala.inline
  def week: typingsSlinky.vegaTypings.vegaTypingsStrings.week = this.cast("week")
  @scala.inline
  def year: typingsSlinky.vegaTypings.vegaTypingsStrings.year = this.cast("year")
}

