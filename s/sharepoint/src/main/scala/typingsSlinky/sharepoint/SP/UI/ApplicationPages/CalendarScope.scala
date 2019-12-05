package typingsSlinky.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarScope extends js.Object

@JSGlobal("SP.UI.ApplicationPages.CalendarScope")
@js.native
object CalendarScope extends js.Object {
  @js.native
  sealed trait daily extends CalendarScope
  
  @js.native
  sealed trait dailyGroup extends CalendarScope
  
  @js.native
  sealed trait monthly extends CalendarScope
  
  @js.native
  sealed trait nothing extends CalendarScope
  
  @js.native
  sealed trait weekly extends CalendarScope
  
  @js.native
  sealed trait weeklyGroup extends CalendarScope
  
  /* 3 */ val daily: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.daily with Double = js.native
  /* 5 */ val dailyGroup: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.dailyGroup with Double = js.native
  /* 1 */ val monthly: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.monthly with Double = js.native
  /* 0 */ val nothing: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.nothing with Double = js.native
  /* 4 */ val weekly: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.weekly with Double = js.native
  /* 2 */ val weeklyGroup: typingsSlinky.sharepoint.SP.UI.ApplicationPages.CalendarScope.weeklyGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarScope with Double] = js.native
}

