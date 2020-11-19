package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskRevealKind extends js.Object
@JSImport("vscode", "TaskRevealKind")
@js.native
object TaskRevealKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskRevealKind with Double] = js.native
  
  /**
    * Always brings the terminal to front if the task is executed.
    */
  @js.native
  sealed trait Always extends TaskRevealKind
  /* 1 */ @js.native
  object Always extends TopLevel[Always with Double]
  
  /**
    * The terminal never comes to front when the task is executed.
    */
  @js.native
  sealed trait Never extends TaskRevealKind
  /* 3 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  /**
    * Only brings the terminal to front if a problem is detected executing the task
    * (e.g. the task couldn't be started because).
    */
  @js.native
  sealed trait Silent extends TaskRevealKind
  /* 2 */ @js.native
  object Silent extends TopLevel[Silent with Double]
}
