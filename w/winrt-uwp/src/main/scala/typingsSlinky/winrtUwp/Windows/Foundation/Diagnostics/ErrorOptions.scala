package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorOptions extends StObject
/** Specifies the type of diagnostic error reporting for a thread. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
@js.native
object ErrorOptions extends StObject {
  
  /** Exceptions are reported. */
  @js.native
  sealed trait forceExceptions extends ErrorOptions
  
  /** No error reporting occurs for the thread. */
  @js.native
  sealed trait none extends ErrorOptions
  
  /** Exceptions are suppressed and not reported. */
  @js.native
  sealed trait suppressExceptions extends ErrorOptions
  
  /** Error information for SetErrorInfo is suppressed and not reported. */
  @js.native
  sealed trait suppressSetErrorInfo extends ErrorOptions
  
  /** Error information for SetErrorInfo is used. */
  @js.native
  sealed trait useSetErrorInfo extends ErrorOptions
}
