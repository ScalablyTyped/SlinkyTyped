package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeDisplayFormat extends js.Object

@JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
@js.native
object DateTimeDisplayFormat extends js.Object {
  @js.native
  sealed trait DateOnly extends DateTimeDisplayFormat
  
  @js.native
  sealed trait DateTime extends DateTimeDisplayFormat
  
  @js.native
  sealed trait TimeOnly extends DateTimeDisplayFormat
  
  /* 0 */ val DateOnly: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateOnly with Double = js.native
  /* 1 */ val DateTime: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateTime with Double = js.native
  /* 2 */ val TimeOnly: typingsSlinky.sharepoint.SPClientTemplates.DateTimeDisplayFormat.TimeOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeDisplayFormat with Double] = js.native
}

