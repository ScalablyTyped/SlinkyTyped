package typingsSlinky.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserInteractionMode extends js.Object
/** Specifies the UI view, optimized for input device type. */
@JSGlobal("Windows.UI.ViewManagement.UserInteractionMode")
@js.native
object UserInteractionMode extends js.Object {
  
  /** The device UI is optimized for mouse input. */
  @js.native
  sealed trait mouse extends UserInteractionMode
  
  /** The device UI is optimized for touch input. */
  @js.native
  sealed trait touch extends UserInteractionMode
}
