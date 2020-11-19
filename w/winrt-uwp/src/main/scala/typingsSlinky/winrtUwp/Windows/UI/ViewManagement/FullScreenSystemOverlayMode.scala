package typingsSlinky.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FullScreenSystemOverlayMode extends js.Object
/** Defines constants that specify how the app responds to edge gestures when in full-screen mode. */
@JSGlobal("Windows.UI.ViewManagement.FullScreenSystemOverlayMode")
@js.native
object FullScreenSystemOverlayMode extends js.Object {
  
  /** Edge gestures call up a temporary UI, which in turn can be used to call up system overlays corresponding to that edge. */
  @js.native
  sealed trait minimal extends FullScreenSystemOverlayMode
  
  /** Edge gestures call up system overlays, like the taskbar and title bar. */
  @js.native
  sealed trait standard extends FullScreenSystemOverlayMode
}
