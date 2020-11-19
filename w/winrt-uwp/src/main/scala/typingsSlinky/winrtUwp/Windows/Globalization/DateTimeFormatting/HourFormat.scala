package typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HourFormat extends js.Object
/** Specifies the intended format for the hour in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.HourFormat")
@js.native
object HourFormat extends js.Object {
  
  /** Display the hour in the most natural way. This will depend on the context, such as the language or clock that is being used. */
  @js.native
  sealed trait default extends HourFormat
  
  /** Do not display the hour. */
  @js.native
  sealed trait none extends HourFormat
}
