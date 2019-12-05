package typingsSlinky.vegaDashTypings.typesSpecScaleMod

import typingsSlinky.vegaDashTypings.typesSpecAxisMod._TickCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.millisecond
  - typings.vegaDashTypings.vegaDashTypingsStrings.second
  - typings.vegaDashTypings.vegaDashTypingsStrings.minute
  - typings.vegaDashTypings.vegaDashTypingsStrings.hour
  - typings.vegaDashTypings.vegaDashTypingsStrings.day
  - typings.vegaDashTypings.vegaDashTypingsStrings.week
  - typings.vegaDashTypings.vegaDashTypingsStrings.month
  - typings.vegaDashTypings.vegaDashTypingsStrings.year
*/
trait TimeInterval extends _TickCount

object TimeInterval {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.day = this.cast("day")
  @scala.inline
  def hour: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.hour = this.cast("hour")
  @scala.inline
  def millisecond: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.millisecond = this.cast("millisecond")
  @scala.inline
  def minute: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.month = this.cast("month")
  @scala.inline
  def second: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.second = this.cast("second")
  @scala.inline
  def week: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.week = this.cast("week")
  @scala.inline
  def year: typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.year = this.cast("year")
}

