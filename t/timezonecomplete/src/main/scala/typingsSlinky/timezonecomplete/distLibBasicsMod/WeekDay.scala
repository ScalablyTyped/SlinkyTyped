package typingsSlinky.timezonecomplete.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDay extends js.Object

@JSImport("timezonecomplete/dist/lib/basics", "WeekDay")
@js.native
object WeekDay extends js.Object {
  @js.native
  sealed trait Friday extends WeekDay
  
  @js.native
  sealed trait Monday extends WeekDay
  
  @js.native
  sealed trait Saturday extends WeekDay
  
  @js.native
  sealed trait Sunday extends WeekDay
  
  @js.native
  sealed trait Thursday extends WeekDay
  
  @js.native
  sealed trait Tuesday extends WeekDay
  
  @js.native
  sealed trait Wednesday extends WeekDay
  
  /* 5 */ val Friday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Friday with Double = js.native
  /* 1 */ val Monday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Monday with Double = js.native
  /* 6 */ val Saturday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Saturday with Double = js.native
  /* 0 */ val Sunday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Sunday with Double = js.native
  /* 4 */ val Thursday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Thursday with Double = js.native
  /* 2 */ val Tuesday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Tuesday with Double = js.native
  /* 3 */ val Wednesday: typingsSlinky.timezonecomplete.distLibBasicsMod.WeekDay.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDay with Double] = js.native
}

