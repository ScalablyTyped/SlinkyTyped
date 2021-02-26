package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalExitStatus extends StObject {
  
  /**
    * The exit code that a terminal exited with, it can have the following values:
    * - Zero: the terminal process or custom execution succeeded.
    * - Non-zero: the terminal process or custom execution failed.
    * - `undefined`: the user forcibly closed the terminal or a custom execution exited
    *   without providing an exit code.
    */
  val code: js.UndefOr[Double] = js.native
}
object TerminalExitStatus {
  
  @scala.inline
  def apply(): TerminalExitStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalExitStatus]
  }
  
  @scala.inline
  implicit class TerminalExitStatusMutableBuilder[Self <: TerminalExitStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
