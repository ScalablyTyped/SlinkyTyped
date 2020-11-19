package typingsSlinky.winrtUwp.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecondFormat extends js.Object
/** Specifies the intended format for the second in a DateTimeFormatter object. */
@JSGlobal("Windows.Globalization.DateTimeFormatting.SecondFormat")
@js.native
object SecondFormat extends js.Object {
  
  /** Display the second in the most natural way. This will depend on the context, such as the language or clock that is being used. */
  @js.native
  sealed trait default extends SecondFormat
  
  /** Do not display the second. */
  @js.native
  sealed trait none extends SecondFormat
}
