package typingsSlinky.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeFormat extends StObject
@JSGlobal("SP.Utilities.DateTimeFormat")
@js.native
object DateTimeFormat extends StObject {
  
  @js.native
  sealed trait dateOnly extends DateTimeFormat
  
  @js.native
  sealed trait dateTime extends DateTimeFormat
  
  @js.native
  sealed trait iSO8601 extends DateTimeFormat
  
  @js.native
  sealed trait longDate extends DateTimeFormat
  
  @js.native
  sealed trait monthDayOnly extends DateTimeFormat
  
  @js.native
  sealed trait monthYearOnly extends DateTimeFormat
  
  @js.native
  sealed trait timeOnly extends DateTimeFormat
  
  @js.native
  sealed trait unknownFormat extends DateTimeFormat
}
