package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskPanelKind extends StObject
@JSImport("vscode", "TaskPanelKind")
@js.native
object TaskPanelKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskPanelKind with Double] = js.native
  
  /**
    * Uses a dedicated panel for this tasks. The panel is not
    * shared with other tasks.
    */
  @js.native
  sealed trait Dedicated extends TaskPanelKind
  /* 2 */ val Dedicated: typingsSlinky.vscode.mod.TaskPanelKind.Dedicated with Double = js.native
  
  /**
    * Creates a new panel whenever this task is executed.
    */
  @js.native
  sealed trait New extends TaskPanelKind
  /* 3 */ val New: typingsSlinky.vscode.mod.TaskPanelKind.New with Double = js.native
  
  /**
    * Shares a panel with other tasks. This is the default.
    */
  @js.native
  sealed trait Shared extends TaskPanelKind
  /* 1 */ val Shared: typingsSlinky.vscode.mod.TaskPanelKind.Shared with Double = js.native
}
