package typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeekFormat extends js.Object

@JSGlobal("Windows.Globalization.DateTimeFormatting.DayOfWeekFormat")
@js.native
object DayOfWeekFormat extends js.Object {
  @js.native
  sealed trait abbreviated extends DayOfWeekFormat
  
  @js.native
  sealed trait default extends DayOfWeekFormat
  
  @js.native
  sealed trait full extends DayOfWeekFormat
  
  @js.native
  sealed trait none extends DayOfWeekFormat
  
  /* 2 */ val abbreviated: typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.abbreviated with Double = js.native
  /* 1 */ val default: typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.default with Double = js.native
  /* 3 */ val full: typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.full with Double = js.native
  /* 0 */ val none: typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting.DayOfWeekFormat.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeekFormat with Double] = js.native
}

