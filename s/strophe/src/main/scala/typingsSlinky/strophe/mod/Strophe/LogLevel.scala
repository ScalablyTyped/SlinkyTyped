package typingsSlinky.strophe.mod.Strophe

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
/** Constants: Log Level Constants
  *  Logging level indicators.
  *
  *  LogLevel.DEBUG - Debug output
  *  LogLevel.INFO - Informational output
  *  LogLevel.WARN - Warnings
  *  LogLevel.ERROR - Errors
  *  LogLevel.FATAL - Fatal errors
  */
@JSImport("strophe", "Strophe.LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait DEBUG extends LogLevel
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  @js.native
  sealed trait ERROR extends LogLevel
  /* 3 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait FATAL extends LogLevel
  /* 4 */ @js.native
  object FATAL extends TopLevel[FATAL with Double]
  
  @js.native
  sealed trait INFO extends LogLevel
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  @js.native
  sealed trait WARN extends LogLevel
  /* 2 */ @js.native
  object WARN extends TopLevel[WARN with Double]
}
