package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationExecutionState extends StObject
/** Specifies the execution state of the app. */
@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends StObject {
  
  /** The app was closed by the user. */
  @js.native
  sealed trait closedByUser extends ApplicationExecutionState
  
  /** The app is not running. */
  @js.native
  sealed trait notRunning extends ApplicationExecutionState
  
  /** The app is running. */
  @js.native
  sealed trait running extends ApplicationExecutionState
  
  /** The app is suspended. */
  @js.native
  sealed trait suspended extends ApplicationExecutionState
  
  /** The app was terminated after being suspended. */
  @js.native
  sealed trait terminated extends ApplicationExecutionState
}
