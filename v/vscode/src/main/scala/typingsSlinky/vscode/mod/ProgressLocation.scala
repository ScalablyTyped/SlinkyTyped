package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProgressLocation extends StObject
@JSImport("vscode", "ProgressLocation")
@js.native
object ProgressLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProgressLocation with Double] = js.native
  
  /**
    * Show progress as notification with an optional cancel button. Supports to show infinite and discrete progress.
    */
  @js.native
  sealed trait Notification extends ProgressLocation
  /* 15 */ val Notification: typingsSlinky.vscode.mod.ProgressLocation.Notification with Double = js.native
  
  /**
    * Show progress for the source control viewlet, as overlay for the icon and as progress bar
    * inside the viewlet (when visible). Neither supports cancellation nor discrete progress.
    */
  @js.native
  sealed trait SourceControl extends ProgressLocation
  /* 1 */ val SourceControl: typingsSlinky.vscode.mod.ProgressLocation.SourceControl with Double = js.native
  
  /**
    * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
    */
  @js.native
  sealed trait Window extends ProgressLocation
  /* 10 */ val Window: typingsSlinky.vscode.mod.ProgressLocation.Window with Double = js.native
}
